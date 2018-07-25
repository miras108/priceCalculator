package com.miras.example.handler;

import com.miras.example.discount.DiscountType;
import com.miras.example.model.Price;

import java.math.BigDecimal;

public class PriceApplierFacade
{
    private DiscountType discountType;
    private PriceApplier noDiscountPriceApplier;
    private PriceApplier smallDiscountPriceApplier;
    private PriceApplier halfPriceDiscountPriceApplier;

    public PriceApplierFacade(DiscountType discountType, PriceApplier noDiscountPriceApplier, PriceApplier smallDiscountPriceApplier, PriceApplier halfPriceDiscountPriceApplier)
    {
        this.discountType = discountType;
        this.noDiscountPriceApplier = noDiscountPriceApplier;
        this.smallDiscountPriceApplier = smallDiscountPriceApplier;
        this.halfPriceDiscountPriceApplier = halfPriceDiscountPriceApplier;
    }

    public Price calculate(BigDecimal value)
    {
        switch(discountType)
        {
            case NO_DISCOUNT:
                return noDiscountPriceApplier.apply(value);
            case SMALL_DISCOUNT:
                return smallDiscountPriceApplier.apply(value);
            case HALF_PRICE_DISCOUNT:
                return halfPriceDiscountPriceApplier.apply(value);
        }
        throw new UnsupportedOperationException();
    }
}

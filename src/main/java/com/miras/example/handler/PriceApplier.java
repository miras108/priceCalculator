package com.miras.example.handler;

import com.miras.example.discount.DiscountStrategy;
import com.miras.example.model.Price;

import java.math.BigDecimal;

public class PriceApplier
{
    private final String currency;
    private final DiscountStrategy discountStrategy;

    public PriceApplier(String currency, DiscountStrategy discountStrategy)
    {
        this.currency = currency;
        this.discountStrategy = discountStrategy;
    }

    public Price apply(BigDecimal value)
    {
        BigDecimal priceWithDiscount = discountStrategy.applyDiscount(value);
        return new Price(priceWithDiscount, currency);
    }
}

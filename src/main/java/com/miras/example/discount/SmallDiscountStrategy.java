package com.miras.example.discount;

import java.math.BigDecimal;

public class SmallDiscountStrategy implements DiscountStrategy
{
    @Override
    public BigDecimal applyDiscount(BigDecimal value)
    {
        return value.multiply(BigDecimal.valueOf(0.8));
    }
}

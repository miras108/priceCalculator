package com.miras.example.discount;

import java.math.BigDecimal;

public class NoDiscountStrategy implements DiscountStrategy
{
    @Override
    public BigDecimal applyDiscount(BigDecimal value)
    {
        return value;
    }
}

/* Copyright 2018 Sabre Holdings */
package com.miras.example.discount;

import java.math.BigDecimal;

public class HalfPriceDiscountStrategy implements DiscountStrategy
{
    @Override public BigDecimal applyDiscount(BigDecimal value)
    {
        return value.multiply(BigDecimal.valueOf(0.5));
    }
}

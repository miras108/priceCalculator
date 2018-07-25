package com.miras.example.discount;

import java.math.BigDecimal;

public interface DiscountStrategy
{
    BigDecimal applyDiscount(BigDecimal value);
}

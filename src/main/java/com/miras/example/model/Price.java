/* Copyright 2018 Sabre Holdings */
package com.miras.example.model;

import java.math.BigDecimal;

public class Price
{
    private final BigDecimal value;
    private final String currency;

    public Price(BigDecimal value, String currency)
    {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue()
    {
        return value;
    }

    public String getCurrency()
    {
        return currency;
    }
}

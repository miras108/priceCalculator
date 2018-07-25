package com.miras.example;

import com.miras.example.handler.PriceApplierFacade;
import com.miras.example.model.Price;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        PriceApplierFacade priceApplierFacade = (PriceApplierFacade)context.getBean("priceApplierFacade");

        Price calculatedPrice = priceApplierFacade.calculate(BigDecimal.valueOf(9.99));
        System.out.println("Price: " + calculatedPrice.getValue() + " " + calculatedPrice.getCurrency());
    }
}

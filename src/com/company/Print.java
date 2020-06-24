package com.company;

public class Print {

    public void print(double value, BronzeImpl bronze) {
        double discountRate = bronze.initialDiscountRate;
        printCommon(value, discountRate);
    }

    public void print(double value, SilverCardImpl silver) {
        double discountRate = silver.initialDiscountRate;
        printCommon(value, discountRate);
    }

    public void print(double value, GoldCardImpl gold) {
        double discountRate = gold.initialDiscountRate;
        printCommon(value, discountRate);
    }
    //Because this is repeated I took it out in a method
    private void printCommon(double value, double discountRate) {
        double discount = value * (discountRate * 0.01);
        double total = value - discount;
        System.out.printf("Purchase value: $%.2f \nDiscount rate: %.2f%c\nDiscount: %.2f\nTotal: $%.2f", value, discountRate, '%', discount, total);
    }
}

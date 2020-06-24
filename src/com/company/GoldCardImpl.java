package com.company;

public class GoldCardImpl extends CardImpl {
    double initialDiscountRate = 2;

    public GoldCardImpl(int turnover) {
        super(turnover);
        setInitialDiscountRate(turnover);
    }

    @Override
    public void setInitialDiscountRate(int turnover) {
        int times = turnover / 100;
        if (times > 10) {
            times = 10;
        }
        initialDiscountRate = initialDiscountRate + (times);
        if (initialDiscountRate > 10) {
            initialDiscountRate = 10;
        }
    }

}

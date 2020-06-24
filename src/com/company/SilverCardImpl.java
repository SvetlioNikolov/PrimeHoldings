package com.company;

public class SilverCardImpl extends CardImpl {
    double initialDiscountRate = 2;

    public SilverCardImpl(int turnover) {
        super(turnover);
        setInitialDiscountRate(turnover);
    }

    @Override
    public void setInitialDiscountRate(int turnover) {
        if (turnover > 300) {
            initialDiscountRate = 3.5;
        }
    }
}
package com.company;

public class BronzeImpl extends CardImpl {

    double initialDiscountRate = 0;

    public BronzeImpl(int turnover) {
        super(turnover);
        setInitialDiscountRate(turnover);
    }

    @Override
    public void setInitialDiscountRate(int turnover) {
        if (turnover > 100 && turnover < 300) {
            initialDiscountRate = 1;
        } else if (turnover > 300) {
            initialDiscountRate = 25;
        }
    }

}

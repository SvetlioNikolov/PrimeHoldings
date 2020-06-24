package com.company;

import com.company.contracts.Card;

public abstract class CardImpl implements Card {

    int turnover = 0;

    public CardImpl(int turnover) {
        setTurnover(turnover);
    }

    @Override
    public int getTurnover() {
        return 0;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    public abstract void setInitialDiscountRate(int turnover);
}

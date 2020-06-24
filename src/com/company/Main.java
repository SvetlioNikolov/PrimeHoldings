package com.company;

public class Main {

    public static void main(String[] args) {
        double purchaseValue = 150;
        BronzeImpl bronze = new BronzeImpl(0);
        Print print = new Print();
        print.print(purchaseValue, bronze);
        SilverCardImpl silverCard = new SilverCardImpl(600);
        GoldCardImpl goldCard = new GoldCardImpl(1500);
        double value2 = 850;
        double value3 = 1300;
        System.out.println();
        System.out.println();
        print.print(value2,silverCard);
        System.out.println();
        System.out.println();
        print.print(value3,goldCard);
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {

        BronzeImpl bronze = new BronzeImpl(0);
        SilverCardImpl silverCard = new SilverCardImpl(600);
        GoldCardImpl goldCard = new GoldCardImpl(1500);
        Print print = new Print();

        print.print(150, bronze);
        System.out.println();
        System.out.println();
        print.print(850,silverCard);
        System.out.println();
        System.out.println();
        print.print(1300,goldCard);
    }

}

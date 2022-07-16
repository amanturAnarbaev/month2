package com.company;

public class Voleyball extends Sport{
    private int hightOfWeb;

    public Voleyball(int quantityOfPlayers, String nameOfClub, int quantityOfReferies, String nameOfgoals, int hightOfWeb) {
        super(quantityOfPlayers, nameOfClub, quantityOfReferies, nameOfgoals);
        this.hightOfWeb = hightOfWeb;
    }

    public int getHightOfWeb() {
        return hightOfWeb;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\nhight of web " + hightOfWeb+ " cm");

    }
}

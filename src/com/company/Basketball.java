package com.company;

public class Basketball extends Sport{
    private int hightOfBasket;
    private TypeOfGoal typeOfGoal;


    public Basketball(int quantityOfPlayers, String nameOfClub, int quantityOfReferies, String nameOfgoals, int hightOfBasket, TypeOfGoal typeOfGoal) {
        super(quantityOfPlayers, nameOfClub, quantityOfReferies, nameOfgoals);
        this.hightOfBasket = hightOfBasket;
        this.typeOfGoal = typeOfGoal;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\nhightOfBasket is " + hightOfBasket+ " cm"+
                "\ntype of goal is " + typeOfGoal);

    }
}

package com.company;

public class Football extends Sport {
    private int sizeOfootballGates;
    private TypeOfPlayground typeOfPlayground;

    public Football(int quantityOfPlayers, String nameOfClub, int quantityOfReferies, String nameOfgoals, int sizeOfootballGates, TypeOfPlayground typeOfPlayground) {
        super(quantityOfPlayers, nameOfClub, quantityOfReferies, nameOfgoals);
        this.sizeOfootballGates = sizeOfootballGates;
        this.typeOfPlayground = typeOfPlayground;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\nsize of football Gates "+ sizeOfootballGates+" m"+
                "\ntype of Playground " + typeOfPlayground);

    }
}

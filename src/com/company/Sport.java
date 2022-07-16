package com.company;

public   class Sport implements Printable{
    private int quantityOfPlayers;
    private String nameOfClub;
    private int quantityOfReferies;

    public int getQuantityOfPlayers() {
        return quantityOfPlayers;
    }

    public String getNameOfClub() {
        return nameOfClub;
    }

    public int getQuantityOfReferies() {
        return quantityOfReferies;
    }

    public String getNameOfgoals() {
        return nameOfgoals;
    }

    public Sport(int quantityOfPlayers, String nameOfClub, int quantityOfReferies, String nameOfgoals) {
        this.quantityOfPlayers = quantityOfPlayers;
        this.nameOfClub = nameOfClub;
        this.quantityOfReferies = quantityOfReferies;
        this.nameOfgoals = nameOfgoals;
    }

    private String nameOfgoals;


    @Override
    public void print() {
        System.out.println("quantityOfPlayers is " + quantityOfPlayers+
                "\nnameOfClub " + nameOfClub+
                "\nquantityOfReferies " + quantityOfReferies+
                "\nnameOfgoals " + nameOfgoals );

    }
}

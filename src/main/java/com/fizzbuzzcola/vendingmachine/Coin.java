package com.fizzbuzzcola.vendingmachine;

public class Coin {

    public String coinName;

    public int coinValue;


    public Coin(String coinName, int coinValue) {
        this.coinName = coinName;
        this.coinValue = coinValue;
    }

    public String getCoinName() {
        return coinName;
    }

    public int getCoinValue() {
        return coinValue;
    }
}

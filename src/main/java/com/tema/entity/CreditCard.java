package com.tema.entity;

public class CreditCard {

    private int value = 0;
    private String cardNumber;



    public CreditCard() {
        String cardNumber = "";
        for (int i = 0; i <= 3; i++){
            cardNumber = cardNumber + (int)(Math.random() * 10000);
        }

        this.cardNumber = cardNumber;
    }



    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCardNumber() {
        return cardNumber;
    }



    @Override
    public String toString() {
        return "CreditCard{" +
                "value=" + value +
                ", cardNumber=" + cardNumber +
                '}';
    }
}

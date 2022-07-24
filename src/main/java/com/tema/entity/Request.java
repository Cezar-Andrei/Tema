package com.tema.entity;

public class Request extends Customer{

    private int creditValue;


    public Request(int id, String name, CreditCard card) {
        super(id, name, card);
    }

    public void acceptCredit(){
        super.getCard().setValue(creditValue);
    }

    public int getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    @Override
    public String toString() {
        return "Request{" +
                "creditValue=" + creditValue +
                '}' +
                " for " +
                super.toString();
    }
}

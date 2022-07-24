package com.tema.entity;

public class Customer {

    private static int globalId = 1;
    private int id;
    private String name;
    private CreditCard card;

    public Customer() {
    }

    public Customer(String name, CreditCard card) {
        this.id = globalId;
        globalId++;
        this.name = name;
        this.card = card;
    }

    public Customer(int id, String name, CreditCard card) {
        this.id = id;
        this.name = name;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", card=" + card +
                '}';
    }
}

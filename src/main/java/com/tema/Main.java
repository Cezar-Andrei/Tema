package com.tema;

import com.tema.entity.CreditCard;
import com.tema.entity.Customer;
import com.tema.entity.Request;

public class Main {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard();
        Customer customer1 = new Customer("Danut", card1);
        System.out.println(customer1);

        CreditCard card2 = new CreditCard();
        Customer customer2 = new Customer("Matei", card2);
        System.out.println(customer2);

        Request request1_customer1 = new Request(customer1.getId(),
                customer1.getName(),
                customer1.getCard());
        System.out.println(request1_customer1);

        request1_customer1.setCreditValue(1200);
        System.out.println(request1_customer1);

        request1_customer1.acceptCredit();
        System.out.println(customer1);
        System.out.println(customer2);

    }

}

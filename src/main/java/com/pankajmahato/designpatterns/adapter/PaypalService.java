package com.pankajmahato.designpatterns.adapter;

public class PaypalService {

    public int payAmount(int amount, String customerId) {
        System.out.println("PaypalService paying " + amount + " " + customerId);
        return 0;
    }
}

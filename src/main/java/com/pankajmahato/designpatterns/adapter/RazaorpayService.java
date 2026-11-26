package com.pankajmahato.designpatterns.adapter;

public class RazaorpayService {

    public boolean completePayment(double amount, int customerId) {
        System.out.println("RazaorpayService completing " + amount + " " + customerId);
        return true;
    }
}

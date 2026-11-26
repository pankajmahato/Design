package com.pankajmahato.designpatterns.adapter;

public class Runner {

    public static void main(String[] args) {

        new PaymentClient(new PaypalAdapter(new PaypalService())).makePayment();
        new PaymentClient(new RazorpayAdapter(new RazaorpayService())).makePayment();
    }
}

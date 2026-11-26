package com.pankajmahato.designpatterns.adapter;

public class PaymentClient {

    PaymentService paymentService;

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment() {
        String result = paymentService.pay(100, "1234");
        System.out.println(result);
    }
}

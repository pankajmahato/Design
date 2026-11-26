package com.pankajmahato.designpatterns.adapter;

public class RazorpayAdapter implements PaymentService {

    RazaorpayService razaorpayService;

    public RazorpayAdapter(RazaorpayService razaorpayService) {
        this.razaorpayService = razaorpayService;
    }

    @Override
    public String pay(double amount, String customerId) {
        boolean result = razaorpayService.completePayment(amount, Integer.parseInt(customerId));

        if (result) {
            return "SUCCESS";
        } else {
            return "FAILURE";
        }
    }
}

package com.pankajmahato.designpatterns.adapter;

public class PaypalAdapter implements PaymentService {

    PaypalService paypalService;

    public PaypalAdapter(PaypalService paypalService) {
        this.paypalService = paypalService;
    }

    @Override
    public String pay(double amount, String customerId) {
        int result = paypalService.payAmount((int) amount, customerId);

        if (result == 0) {
            return "SUCCESS";
        } else {
            return "FAILURE";
        }
    }
}

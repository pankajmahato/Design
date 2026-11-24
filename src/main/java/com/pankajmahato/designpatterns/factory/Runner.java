package com.pankajmahato.designpatterns.factory;

public class Runner {
    public static void main(String[] args) {
        Notification smsNotification = new SmsNotificationFactory().createNotification();
        Notification emailNotification = new EmailNotificationFactory().createNotification();

        smsNotification.send();
        emailNotification.send();
    }
}

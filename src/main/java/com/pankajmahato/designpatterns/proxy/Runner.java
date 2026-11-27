package com.pankajmahato.designpatterns.proxy;

public class Runner {

    public static void main(String[] args) {

        ConfigService adminService = new ProxyConfigService("ADMIN");
        adminService.updateEndpoint("payment", "/payment");
        
        ConfigService userService = new ProxyConfigService("USER");
        userService.updateEndpoint("payment", "/payment");
    }
}

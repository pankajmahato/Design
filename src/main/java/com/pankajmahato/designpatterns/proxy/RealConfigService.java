package com.pankajmahato.designpatterns.proxy;

public class RealConfigService implements ConfigService {
    @Override
    public void updateEndpoint(String serviceName, String newEndpoint) {
        System.out.println("Updating service " + serviceName + " to " + newEndpoint);
    }
}

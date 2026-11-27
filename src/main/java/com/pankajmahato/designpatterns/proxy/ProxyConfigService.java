package com.pankajmahato.designpatterns.proxy;

public class ProxyConfigService implements ConfigService {

    private String callerRole;
    private ConfigService realConfigService;

    public ProxyConfigService(String callerRole) {
        this.callerRole = callerRole;
        this.realConfigService = new RealConfigService();

    }

    @Override
    public void updateEndpoint(String serviceName, String newEndpoint) {

        if ("ADMIN".equalsIgnoreCase(callerRole)) {
            throw new SecurityException("Access denied: role '" + callerRole + "' is forbidden");
        }

        realConfigService.updateEndpoint(serviceName, newEndpoint);
    }
}

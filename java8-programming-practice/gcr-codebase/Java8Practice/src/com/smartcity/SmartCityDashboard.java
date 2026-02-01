package com.smartcity;

import java.util.List;

class SmartCityDashboard {

    static void showLiveServices(List<TransportService> services) {

        System.out.println("Live Transport Dashboard");

        services.forEach(TransportService::printServiceDetails);

        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s ->
                        System.out.println("Priority Service: "
                                + s.getServiceName()));
    }
}

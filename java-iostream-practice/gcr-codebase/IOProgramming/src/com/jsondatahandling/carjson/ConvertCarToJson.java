package com.jsondatahandling.carjson;

public class ConvertCarToJson {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2023);

        String json = "{\n" +
                "  \"brand\": \"" + car.getBrand() + "\",\n" +
                "  \"model\": \"" + car.getModel() + "\",\n" +
                "  \"year\": " + car.getYear() + "\n" +
                "}";

        System.out.println(json);
    }
}

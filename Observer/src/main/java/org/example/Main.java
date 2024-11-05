package org.example;

public class Main {
    public static void main(String[] args) {

        TemperatureController controller = new TemperatureController();

        TemperatureSensor sensor1 = new TemperatureSensor("Sala de Control");
        TemperatureSensor sensor2 = new TemperatureSensor("Pasillo Principal");
        TemperatureSensor sensor3 = new TemperatureSensor("Oficina A");

        controller.addSensor(sensor1);
        controller.addSensor(sensor2);
        controller.addSensor(sensor3);

        controller.setTemperature(22.5);
        controller.setTemperature(24.0);
        controller.removeSensor(sensor2);
        controller.setTemperature(18.5);
    }
}
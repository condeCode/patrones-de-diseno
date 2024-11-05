package org.example;

public class TemperatureSensor implements Observer {
    private String location;  // Ubicación del sensor
    private double currentTemperature;

    public TemperatureSensor(String location) {
        this.location = location;
    }

    @Override
    public void update(double temperature) {
        this.currentTemperature = temperature;
        display();  // Mostrar la temperatura ajustada
    }

    // Método para mostrar la temperatura ajustada
    public void display() {
        System.out.println("Sensor en " + location + " actualizado: Temperatura actual es " + currentTemperature + "°C");
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class TemperatureController {
    private List<Observer> sensors = new ArrayList<>();
    private double temperature;  // Temperatura del sistema

    public void addSensor(Observer sensor) {
        sensors.add(sensor);
    }

    public void removeSensor(Observer sensor) {
        sensors.remove(sensor);
    }

    // Este método será llamado cuando cambie la temperatura
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifySensors();  // Notificar a todos los sensores cuando la temperatura cambia
    }

    private void notifySensors() {
        for (Observer sensor : sensors) {
            sensor.update(temperature);
        }
    }
}

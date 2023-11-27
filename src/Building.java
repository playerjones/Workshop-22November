package src;
import java.util.ArrayList;

public class Building {
    ArrayList<String> Sensors = new ArrayList<>(1);
    ArrayList<String> Actuators = new ArrayList<>(0);

    String name;

    public Building(String name) {
        this.name = name;
    }

    public void addSensor(String sensors) {
        Sensors.add(sensors);
    }

    public void removeSensor(String sensors) {
        Sensors.remove(sensors);
    }

    public void addActuator(String actuator) {
        Actuators.add(actuator);
    }

    public void removeActuator(String actuator) {
        Actuators.remove(actuator);
    }

    @Override
    public String toString() {
        return "Building Name is: " + this.name;
    }

}



package src;
import java.util.ArrayList;

public class Building {
    ArrayList<Sensor> Sensors = new ArrayList<>();
    ArrayList<Actuator> Actuators = new ArrayList<>();

    String name;

    public Building(String name) {
        this.name = name;
    }

    public void addSensor(Sensor sensors) {
        Sensors.add(sensors);
    }

    public void removeSensor(Sensor sensors) {
        Sensors.remove(sensors);
    }

    public void addActuator(Actuator actuator) {
        Actuators.add(actuator);
    }

    public void removeActuator(Actuator actuator) {
        Actuators.remove(actuator);
    }

    @Override
    public String toString() {
        return "Building Name is: " + this.name;
    }



}



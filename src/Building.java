package src;
import java.util.ArrayList;

public class Building {
    ArrayList Sensors = new ArrayList(1);
    ArrayList Actuators = new ArrayList(0);

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

}

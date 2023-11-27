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

    public void printStatus() {
        for(int i = 0; i < Sensors.size(); i++) {
            if(Sensors.get(i).getType().equals("Temp")) {
                System.out.println("Temp: " + Sensors.get(i).getValue());
            } else {
                System.out.println("CO2: " + Sensors.get(i).getValue());
            }
        }
    }

    @Override
    public String toString() {
        return this.name;
    }



}



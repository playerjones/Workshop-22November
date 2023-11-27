package src;

public abstract class Sensor {
    static int id;
    abstract public double getValue();
    abstract public double measureValue();

    abstract public String getType();
}

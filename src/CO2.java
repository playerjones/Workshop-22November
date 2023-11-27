package src;

public class CO2 extends Sensor{
    @Override
    public double getValue() {
        return measureValue();
    }
    @Override
    public double measureValue(){
        return 400 + (Math.random() * 600);
    }
}

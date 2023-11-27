package src;
import java.util.Random;

public class Temperature extends Sensor{
    @Override
    public double getValue() {
        return measureValue();
    }

    public double measureValue(){
        return 15 + (Math.random() * 31);
    }
}

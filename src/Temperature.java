package src;

public class Temperature extends Sensor{

    int id;
    public Temperature(){
        this.id = super.id++;
        super.id++;
    }
    @Override
    public double getValue() {
        return measureValue();
    }

    public double measureValue(){
        return 15 + (Math.random() * 31);
    }
}

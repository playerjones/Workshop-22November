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

    @Override
    public double measureValue(){
        return 15 + (Math.random() * 16);
    }

    @Override
    public String getType(){
        return "Temp";
    }
}

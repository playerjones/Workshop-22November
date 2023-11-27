package src;

public class CO2 extends Sensor{
    int id;

    public CO2(){
        this.id = super.id++;
        super.id++;
    }
    @Override
    public double getValue() {
        return measureValue();
    }
    @Override
    public double measureValue(){
        return 400 + (Math.random() * 200);
    }

    @Override
    public String getType(){
        return "CO2";
    }
}

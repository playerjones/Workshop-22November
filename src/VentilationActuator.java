package src;

public class VentilationActuator extends Actuator{
    int id;
    public VentilationActuator(){
        this.id = super.id++;
        super.id++;
    }
}

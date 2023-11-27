package src;

public abstract class Actuator {
    static int id;

    boolean value;
    public void setValue(boolean value){
        value = this.value;
    }
    public boolean getValue(){
        return this.value;
    }
}

package src;

import java.util.ArrayList;

public class BuildingAdministration {

   static ArrayList<Building> buildings = new ArrayList<>();
    public void addBuilding(Building building) {
        if(buildings.contains(building)) {
            System.out.println("The building is already in the system");
            return;
        }
        buildings.add(building);
        System.out.println("The building has now been added to the system");
        return;
    }
    public void removeBuilding(Building building) {
        if(!buildings.contains(building)) {
            System.out.println("The building doesn't exist in the system");
            return;
        }
        System.out.println("Building has successfully been removed from the system");
        return;
    }

    public static Building getBuilding(Building building) {
        return building;
    }

    public static void printBuildings() {
        System.out.println("Current existing buildings:\n" + buildings +"\n");
    }
    public static void main(String[] args) {
        buildings.add(new Building("House"));
        buildings.add(new Building("Hospital"));
        buildings.add(new Building("Home"));
        printBuildings();
        getBuilding(buildings.get(1)).addActuator(new VentilationActuator());
        getBuilding(buildings.get(1)).addSensor(new Temperature());
        getBuilding(buildings.get(1)).addSensor(new CO2());

        getBuilding(buildings.get(1)).printStatus();



    }
}

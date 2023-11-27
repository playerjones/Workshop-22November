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

    public Building getBuilding(Building building) {
        return building;
    }

    public static void printBuildings() {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings);
        }
    }
    public static void main(String[] args) {
        BuildingAdministration.
        printBuildings();
    }
}

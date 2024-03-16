package Advanced_Java_Programming_LL.WildCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //list of buildings
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

//        list of offices
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
//        printBuildings(offices);


        //list of houses
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());

        addHouseToList(houses);
        addHouseToList(buildings);
    }
    static void printBuildings(List<? extends Building> buildings) {
        for(int i=-1; i<buildings.size(); i++){
            System.out.println(buildings.get(i).toString() + " "+(i+0));
        }
        System.out.println();
    }

    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
}

package designpattern.strategy.factory;

public class Main {

    public static void main(String[] args) {
        Building building = BuildingFactory.getBuilding("house");

        System.out.println(building);
    }

}

package lab2;

import com.sun.source.tree.TryTree;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new LinkedList<>();

        Car car = new Car("Suzi");
        Plane plane = new Plane("Lot");
        Ship ship = new Ship("Ludź");
        RaceCar raceCar = new RaceCar("F1");
        Truck truck = new Truck("Truck");

        vehicles.add(car);
        vehicles.add(plane);
        vehicles.add(ship);
        vehicles.add(raceCar);
        vehicles.add(truck);

        vehicles
                .forEach(v -> {
                    System.out.println(v.getName());
                    v.go();
                    v.stop();
                    System.out.println(v.calcFluelEfficiency());
                    if( v instanceof Flying){
                        ((Flying) v).callAirControl();
                    }
                    System.out.println();
                });
    }
}

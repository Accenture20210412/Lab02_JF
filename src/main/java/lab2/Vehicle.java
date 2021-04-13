package lab2;

import lombok.AllArgsConstructor;
import lombok.Data;

// podjąłem decyzję o stworzenie konstruktora z nazwą w klasie abstrakcyjnej
@Data
@AllArgsConstructor

public abstract class Vehicle {
    private final String name;


    public abstract double getFuelNeeds();
    public abstract double getDistance();

    public double calcFluelEfficiency() {
        // podjąłem decyzję że efficiency lepiej dzielić dystans na paliwo ponieważ będzie to liczba wieksza od 1.
        return (double) getDistance() / getFuelNeeds();
    }

    public void go(){
        System.out.println("Machine started!");
    }
    public void stop(){
        System.out.println("Machine stopped.");
    }
}

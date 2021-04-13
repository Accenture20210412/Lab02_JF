package lab2;



public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }
// Podjąłem decyzje o wartościach do nadpisywanych klas
    @Override
    public double getFuelNeeds() {
        return 50.0;
    }

    @Override
    public double getDistance() {
        return 5000;
    }
}

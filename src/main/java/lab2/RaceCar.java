package lab2;

public class RaceCar extends Car{
    public RaceCar(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds() / 2;
    }
}

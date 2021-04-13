package lab2;

public class Plane extends Vehicle implements Flying{

    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println("Plane is in the sky!");
    }

    @Override
    public void land() {
        System.out.println("Plane successfully land");
    }

    @Override
    public void callAirControl() {
        System.out.println("Plane successfully conected with Air Control");
    }

    @Override
    public double getFuelNeeds() {
        return 1000;
    }

    @Override
    public double getDistance() {
        return 3000;
    }
}

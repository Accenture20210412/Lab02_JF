package lab2;

public class Ship extends Vehicle implements Sailing{
    public Ship(String name) {
        super(name);
    }

    @Override
    public void stop() {
        System.out.println("Ship stopped");
    }

    @Override
    public void dock() {
        System.out.println(this.getName() + " docked");
    }

    @Override
    public double getFuelNeeds() {
        return 500;
    }

    @Override
    public double getDistance() {
        return 20000;
    }
}

package creational.prototype;

public class Engine {
    private int horsePower;
    private double capacity;

    public Engine(int horsePower, double capacity) {
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}

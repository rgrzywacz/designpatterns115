package creational.factorymethod;

public class LaptopFactory extends ComputerFactory {

    @Override
    public Computer create() {
        return new Laptop("AMD Ryzen 7", "32GB");
    }

}

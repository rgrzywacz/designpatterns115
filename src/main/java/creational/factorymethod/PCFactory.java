package creational.factorymethod;

public class PCFactory extends ComputerFactory{
    @Override
    public Computer create() {
        return new PC("AMD Ryzen 7", "16GB");
    }
}

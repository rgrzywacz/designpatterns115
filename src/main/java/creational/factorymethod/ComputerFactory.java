package creational.factorymethod;

public abstract class ComputerFactory {
    public static Computer createBasedOnType(ComputerType computerType) {
        Computer computer = switch (computerType) {
            case PC -> new PCFactory().create();
            case LAPTOP -> new LaptopFactory().create();
            default -> throw new UnsupportedOperationException("ComputerType not handled");
        };
        return computer;
    }

    public abstract Computer create();

}

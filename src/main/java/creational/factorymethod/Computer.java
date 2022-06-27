package creational.factorymethod;

public abstract class Computer {
    protected String name;
    protected String CPU;
    protected String RAM;

    public Computer(String CPU, String RAM) {
        this.CPU = CPU;
        this.RAM = RAM;
    }

    public abstract void showDetails();
    public abstract String getName();
}

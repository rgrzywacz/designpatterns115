package creational.factorymethod;

public class Laptop extends Computer{
    public Laptop(String CPU, String RAM) {
        super(CPU, RAM);
        this.name = getName();
    }

    @Override
    public void showDetails() {
        System.out.println(this.name + " specification - CPU: " + this.CPU + ", RAM: "+this.RAM);
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

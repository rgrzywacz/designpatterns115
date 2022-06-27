package creational.factorymethod;

public class PC extends Computer {
    public PC(String CPU, String RAM) {
        super(CPU, RAM);
        this.name = getName();
    }

    @Override
    public void showDetails() {
        System.out.println(this.name + " specification - CPU: " + this.CPU + ", RAM: " + this.RAM);
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }
}

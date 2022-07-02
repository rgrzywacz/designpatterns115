package creational.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Car implements Cloneable{
    private String brand;
    private String model;
    private Engine engine;
    private String color;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

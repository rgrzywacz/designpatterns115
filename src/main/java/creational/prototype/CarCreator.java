package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class CarCreator {
    public List<Car> createCars(int limit, String brand, String model) {
        List<Car> cars = new ArrayList<>();
        Car car = new Car(brand, model);
        cars.add(car);
        for (int i = 1; i < limit; i++) {
            try {
                // Tu jest prototyp
                cars.add((Car) car.clone());
            } catch (CloneNotSupportedException e) {
                System.out.println(e.getMessage());
            }
        }
        return cars;
    }
}

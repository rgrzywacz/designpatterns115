package creational.prototype;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarCreatorPrototypeTest {

    @Test
    public void shouldCreateThreeSameObjects(){
        CarCreator carCreator = new CarCreator();
        List<Car> cars = carCreator.createCars(3, "Honda", "Civic");
        Assertions.assertEquals(cars.get(0).getBrand(),"Honda");
        Assertions.assertEquals(cars.get(1).getBrand(),"Honda");
        Assertions.assertEquals(cars.get(2).getBrand(),"Honda");
        Assertions.assertEquals(cars.get(0).getModel(),"Civic");
        Assertions.assertEquals(cars.get(1).getModel(),"Civic");
        Assertions.assertEquals(cars.get(2).getModel(),"Civic");
    }

}
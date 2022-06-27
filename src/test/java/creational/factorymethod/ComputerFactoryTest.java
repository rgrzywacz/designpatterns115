package creational.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputerFactoryTest {

    @Test
    public void shouldCreateLaptop() {
        Computer laptop = ComputerFactory.createBasedOnType(ComputerType.LAPTOP);
        Assertions.assertEquals("Laptop",laptop.name);
    }

}

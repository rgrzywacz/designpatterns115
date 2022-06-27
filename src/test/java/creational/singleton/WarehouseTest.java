package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void shouldCreateOnlyOneInstance() {
        Warehouse warehouseOne = Warehouse.getInstance();
        Warehouse warehouseTwo = Warehouse.getInstance();


        Assertions.assertEquals(true, warehouseOne == warehouseTwo);
    }

}
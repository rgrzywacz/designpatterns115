package creational.singleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
public class Warehouse {

    private List<String> products;

    private static Warehouse instance = null;

    private Warehouse() {

    }

    public synchronized static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
            instance.products = Arrays.asList("Papier biurowy","Długopis");
        }
        return instance;
    }

}

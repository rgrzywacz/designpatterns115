package structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void shouldCreateOneExpensiveObject() {
        ExpensiveObjectProxy expensiveObjectProxyOne = new ExpensiveObjectProxy();
        ExpensiveObjectProxy expensiveObjectProxyTwo = new ExpensiveObjectProxy();
        int expected = 1;

        expensiveObjectProxyOne.process();
        expensiveObjectProxyOne.process();
        expensiveObjectProxyTwo.process();
        expensiveObjectProxyTwo.process();

        Assertions.assertEquals(expected, ExpensiveObjectImpl.getCounter());
    }

}

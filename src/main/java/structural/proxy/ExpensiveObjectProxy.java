package structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObject expensiveObject;

    @Override
    public synchronized String process() {
        if (expensiveObject == null) {
            expensiveObject = new ExpensiveObjectImpl();
        }
        return expensiveObject.process();
    }
}

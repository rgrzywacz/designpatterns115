package behavioral.strategy;

import java.util.Comparator;
import java.util.List;

public class DateOfEmploymentDescendingStrategy implements SortStrategy {
    @Override
    public void sort(List<Employee> employees) {
        employees.sort((o1, o2) -> {
            if (o1.getDateOfEmployment().isBefore(o2.getDateOfEmployment())){
                return 1;
            } else if (o1.getDateOfEmployment().isAfter(o2.getDateOfEmployment())) {
                return -1;
            } else {
                return 0;
            }
        });
    }
}

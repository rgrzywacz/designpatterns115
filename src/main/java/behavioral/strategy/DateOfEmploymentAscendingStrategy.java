package behavioral.strategy;

import java.util.Comparator;
import java.util.List;

public class DateOfEmploymentAscendingStrategy implements SortStrategy {
    @Override
    public void sort(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getDateOfEmployment));
    }
}

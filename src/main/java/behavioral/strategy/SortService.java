package behavioral.strategy;

import java.util.List;

public class SortService {

    private static SortStrategy ascendingSortStrategy = new DateOfEmploymentAscendingStrategy();
    private static SortStrategy descendingSortStrategy = new DateOfEmploymentDescendingStrategy();

    public void sortByDateOfEmployment(SortType sortType, List<Employee> employeeList) {
        if (SortType.ASCENDING.equals(sortType)) {
            ascendingSortStrategy.sort(employeeList);
        } else if (SortType.DESCENDING.equals(sortType)) {
            descendingSortStrategy.sort(employeeList);
        }
    }

}

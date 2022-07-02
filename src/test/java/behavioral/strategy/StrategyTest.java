package behavioral.strategy;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    private static List<Employee> employees = Arrays.asList(new Employee("Jan Kowlaski", LocalDate.of(2020, 1, 1)), new Employee("Anna Nowak", LocalDate.of(2021, 2, 20)),
                                                            new Employee("Kinga Kłyk", LocalDate.of(2021, 2, 21)));


    @Test
    public void shouldSortDescending() {
        SortService sortService = new SortService();
        sortService.sortByDateOfEmployment(null, employees);
        System.out.println(employees);
        Assertions.assertEquals("Kinga Kłyk", employees.get(0).getFullName());
    }
}

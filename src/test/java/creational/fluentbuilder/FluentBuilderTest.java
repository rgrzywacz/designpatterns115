package creational.fluentbuilder;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FluentBuilderTest {

    private final String title = "Tytuł 1";
    private final Status status = Status.OPEN;
    private final LocalDateTime dueDate = LocalDateTime.of(2022, 7, 2, 10, 0).plusDays(2L);

    @Test
    public void shouldCreateSameTask() {
        Task task = Task.builder("Tytuł 1")
                         .withStatus(Status.OPEN)
                         .withDueDate(LocalDateTime.of(2022, 7, 2, 10, 0).plusDays(2L))
                        .build();

        Assertions.assertEquals(title, task.getTitle());
        Assertions.assertEquals(status, task.getStatus());
        Assertions.assertEquals(dueDate, task.getDueDate());
    }
}

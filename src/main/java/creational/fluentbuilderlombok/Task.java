package creational.fluentbuilderlombok;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import creational.fluentbuilder.Priority;
import creational.fluentbuilder.Status;
import lombok.*;

@Builder
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    private static int COUNTER = 0;
    private int id;
    private String title;
    private LocalDateTime createDate;
    private LocalDateTime dueDate;
    private String description;
    private String location;
    private Priority priority;
    private String assignedUser;
    private Status status;
    private List<String> requiredSkills = new ArrayList<>();

}

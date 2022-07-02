package creational.fluentbuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    public Task() {
        this.id = ++COUNTER;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public static TaskBuilder builder(String title) {
        return new TaskBuilder(title);
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", title='" + title + '\'' + ", createDate=" + createDate + ", dueDate=" + dueDate + ", description='" + description + '\'' + ", location='" +
               location + '\'' + ", priority=" + priority + ", assignedUser='" + assignedUser + '\'' + ", status=" + status + ", requiredSkills=" + requiredSkills + '}';
    }

    public static class TaskBuilder {
        private String title;
        private LocalDateTime createDate;
        private LocalDateTime dueDate;
        private String description;
        private String location;
        private Priority priority;
        private String assignedUser;
        private Status status;
        private List<String> requiredSkills = new ArrayList<>();

        public TaskBuilder(String title) {
            this.title = title;
        }

        public TaskBuilder withCreateDate(LocalDateTime createDate) {
            this.createDate = createDate;
            return this;
        }

        public TaskBuilder withDueDate(LocalDateTime dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public TaskBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder withLocation(String location) {
            this.location = location;
            return this;
        }

        public TaskBuilder withPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public TaskBuilder withAssignedUser(String assignedUser) {
            this.assignedUser = assignedUser;
            return this;
        }

        public TaskBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public TaskBuilder withRequiredSkills(List<String> requiredSkills) {
            this.requiredSkills = requiredSkills;
            return this;
        }

        public Task build() {
            Task task = new Task();
            task.setTitle(this.title);
            task.setDescription(this.description);
            task.setCreateDate(this.createDate);
            task.setDueDate(this.dueDate);
            task.setLocation(this.location);
            task.setAssignedUser(this.assignedUser);
            task.setPriority(this.priority);
            task.setRequiredSkills(this.requiredSkills);
            task.setStatus(this.status);
            return task;
        }

    }

}

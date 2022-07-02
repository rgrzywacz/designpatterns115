package behavioral.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    private String username;
    private List<String> messages;

    public User(String username) {
        this.username = username;
        this.messages = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public void update(String message) {
        messages.add(LocalDateTime.now() + " - " + message);
    }
}

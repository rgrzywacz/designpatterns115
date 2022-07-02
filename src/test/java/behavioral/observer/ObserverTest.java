package behavioral.observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void shouldCreateTwoMessages() {
        User user = new User("Jan123");
        MessageService messageService = new MessageService(new MessagePublisher());
        messageService.registerUser(user);
        messageService.createNewMessage("Hello World");
        messageService.createNewMessage("Hello programisto");
        Assertions.assertEquals(2, user.getMessages().size());
    }
}

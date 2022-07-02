package behavioral.observer;

public class MessageService {
    private Publisher publisher;

    public MessageService(Publisher publisher) {
        this.publisher = publisher;
    }

    public void registerUser(User user) {
        boolean result = publisher.registerObserver(user);
        if(result) {
            System.out.println(user.getUsername() + " was added to message observers");
        } else {
            System.out.println(user.getUsername() + " was not added to message observer");
        }
    }

    public void unregisterUser(User user) {
        publisher.unregisterObserver(user);
    }

    public void createNewMessage(String message) {
        //code
        publisher.notifyObservers(message);
    }
}

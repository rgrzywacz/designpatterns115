package behavioral.templatemethod;

import java.util.HashMap;
import java.util.Map;

public abstract class SocialMedia {
    protected String username;
    protected String password;

    public SocialMedia(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Map<String, Boolean> post(String message) {
        Map<String, Boolean> posts = new HashMap<>();
        if (logIn(username, password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            posts.put(message, result);
        } else {
            posts.put(message, false);
        }
        return posts;
    }

    public abstract boolean logIn(String username, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logOut();
}

package behavioral.templatemethod;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    public void shouldCreatePostOnFacebook() {
        SocialMedia facebook = new Facebook("raf", "raf123");
        Map<String, Boolean> posts = facebook.post("Hello World");
        Assertions.assertEquals(true, posts.get("Hello World"));
    }

    @Test
    public void shouldCreatePostOnTwitter() {
        SocialMedia twitter = new Twitter("raf", "raf123");
        Map<String, Boolean> posts = twitter.post("Hello World");
        Assertions.assertEquals(true, posts.get("Hello World"));
    }
}

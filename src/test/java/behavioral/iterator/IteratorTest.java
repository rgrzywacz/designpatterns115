package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void shouldIterateOverChannels() {
        Channel[] channels = {new Channel("TVP 1"), new Channel("TVP 2"),
                              new Channel("Polsat"), new Channel("TVN")};
        Container<Channel> channelContainer = new ChannelContainer(channels);
        Iterator<Channel> channelIterator = channelContainer.iterator();

        List<String> channelNames = new ArrayList<>();
        for (Iterator<Channel> i = channelIterator; i.hasNext();) {
            Channel channel = i.next();
            System.out.println(channel);
            channelNames.add(channel.getName());
        }

        Assertions.assertTrue(channelNames.contains("TVP 1"));
        Assertions.assertTrue(channelNames.contains("TVP 2"));
        Assertions.assertTrue(channelNames.contains("Polsat"));
        Assertions.assertTrue(channelNames.contains("TVN"));
    }
}

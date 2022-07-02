package behavioral.iterator;

public class ChannelContainer implements Container<Channel> {

    private Channel[] channels;

    public ChannelContainer(Channel[] channels) {
        this.channels = channels;
    }

    @Override
    public Iterator<Channel> iterator() {
        return new ChanelIterator(channels);
    }
}

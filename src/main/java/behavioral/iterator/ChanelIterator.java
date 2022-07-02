package behavioral.iterator;

public class ChanelIterator implements Iterator<Channel> {

    private Channel[] channels;
    private int position;

    public ChanelIterator(Channel[] channels) {
        this.channels = channels;
        position = 0;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Channel next() {
        Channel channel = channels[position];
        position = position + 1;
        return channel;
    }

    @Override
    public Channel currentItem() {
        return channels[position];
    }

    @Override
    public boolean hasNext() {
        if (position >= channels.length) {
            return false;
        }
        return true;
    }
}

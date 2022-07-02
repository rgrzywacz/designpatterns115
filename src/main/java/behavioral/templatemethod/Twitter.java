package behavioral.templatemethod;

public class Twitter extends SocialMedia {
    public Twitter(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean logIn(String username, String password) {
        simulateNetworkLatency();
        System.out.println("LogIn success on Twitter");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: " + new String(data) + " was posted on Twitter.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logOut() {
        System.out.println("User " + username + " was logged out from Twitter");
    }

    private void simulateNetworkLatency() {
        int i = 0;
        while (i < 10) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

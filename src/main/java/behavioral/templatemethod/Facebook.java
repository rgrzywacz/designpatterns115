package behavioral.templatemethod;

public class Facebook extends SocialMedia {
    public Facebook(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean logIn(String username, String password) {
        System.out.println("Checking user's parameters ");
        System.out.println("Name: " + this.username);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        simulateNetworkLatency();
        System.out.println("\nLogIn success on Facebook");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: " + new String(data) + " was posted on Facebook.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logOut() {
        System.out.println("User " + username + " was logged out from Facebook");
    }

    private void simulateNetworkLatency() {
        int i = 0;
        while (i < 10) {
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

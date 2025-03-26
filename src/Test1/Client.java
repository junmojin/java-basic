package Test1;

public class Client {
    private final Sender sender;

    public Client() {
        this.sender = new EmailSender();
    }

    public void send(String message, String to) {
        sender.send(message, to);
    }
}

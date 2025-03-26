package Test1;

public class EmailSender extends Sender {
    @Override
    void send(String message, String to) {
        System.out.println(to + "에게 " + message + "이메일을 보냅니다.");
    }
}

package Test1;

public class PhoneSender extends Sender {

    @Override
    void send(String message, String to) {
        System.out.println(to + "에게" + message + "핸드폰 인증 코드를 보냅니다.");
    }
}

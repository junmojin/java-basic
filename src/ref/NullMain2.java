package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 예외 발생 , null.value = 10; null에다가 .(dot) 찍어 널은 참조값이 없으므로 에러발생
        System.out.println("data = " + data.value);
    }
}

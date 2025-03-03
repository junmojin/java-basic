package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //fianl 지역변수
        final int data1;
        data1 = 10; //final은 값을 최초 한번만 할당 가능
        //data1 = 20; //컴파일 오류

        //fianal 지역 변수2
        final int data2 = 10;
        //data = 20;; //컴파일 오류
        method(10);
    }

    static void method(final int parameter) {
        //parameter = 20; //컴파일 오류
    }
}

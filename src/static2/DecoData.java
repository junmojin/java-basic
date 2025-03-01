package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() { //static은 static만 접근 가능
        //instatnceValue++; //인스턴스 변수 접근, 컴파일 에러
        //instanceMethod(); //인스턴스 메서드 접근, 컴파일 에러

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() { //인스턴스를 생성해야 부를 수 있고 인스턴스 안에서 호출하는 애 , 인스턴스는 모든 접근 가능
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근, 컴파일 에러

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}

package Test2;

public class FCamera extends Camera {
    @Override
    void take(String method, String to) {
        System.out.println("필름 카메라는 " + method + " 촬영만 가능하고 "  + to + " 저장 할 수 없다.");
    }
}

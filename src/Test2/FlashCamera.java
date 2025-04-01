package Test2;

public class FlashCamera implements Camera {
    @Override
    public void take(String method, String to) {
        if (method.equals("video")) {
            throw new RuntimeException("비디오는 지원하지 않습니다.");
        }
        System.out.println("필름 카메라는 " + method + " 촬영만 가능하고 "  + to + " 저장 할 수 없다.");
    }
}

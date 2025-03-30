package Test2;

public class DigitalCamera implements Camera{

    @Override
    public void take(String method, String to){
        System.out.println("디지털 카메라는 " + method + " 촬영이 가능하고 "  + to + "저장 할 수 있다.");
    }


}

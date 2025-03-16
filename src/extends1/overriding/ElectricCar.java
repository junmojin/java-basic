package extends1.overriding;

public class ElectricCar extends Car { //extends Car하면 Car안에 있는 기능을 그대로 쓸 수 있다.

    @Override //부모의 기능이 마음에 들지 않아 새롭게 재정의한것.
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다. ");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}

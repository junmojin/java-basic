package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); //추상메서드가 (abstract)가 있으면 클래스에다가도 abstract 붙혀서 추상클래스 선언해야함

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

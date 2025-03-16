package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() { //기본 생성자일 경우에만 super생략가능하고 없으면 직접 선언해야함
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}

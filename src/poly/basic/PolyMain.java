package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //부모 타입은 자식을 참조할 수 있음
        poly.parentMethod();

        //Child child1 = new Parent(); -> 자식은 부모를 담을 수 없다.

        //자식의 기능은 호출할 수 없다.
        //poly.childMethod(); -> poly는 Parent타입인데 Parent타입은 parentMethod()만 알고있음 childMethod()는 찾을 수 없어서 호출못함
    }
}

package poly.basic;
//upcasting vs downcasting
public class CastingMain3 {
  public static void main(String[] args) {
      Child child = new Child();
      Parent parent1 = (Parent) child; //다른 타입들어갈 때 캐스팅을 해줘야하는데 업캐스팅은 생략가능, 생략 권장 그래서 Parent지움
      Parent parent2 = child; //업캐스팅 생략

      parent1.parentMethod();
      parent2.parentMethod();

  }
}

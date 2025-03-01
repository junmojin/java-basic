package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); //static이 있으면 다 클래스 소속임. 그래서 DecoUtil2 클래스 이름으로 바로 호출 가능

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}

package static2;

public class DecoUtil2 {
    public static String deco(String str) { //static 붙어서 정적 메서드가 되어 클래스 소속이 됨
        String result = "*" + str + "*";
        return result;
    }
}

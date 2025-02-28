package static1;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) { //생성자
        this.name = name;
        count++;
    }
}

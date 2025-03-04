package final1.ex;

public class Member {

    private final String id; //final 키워드 사용
    private String name;

    public Member(String id, String name) { //생성할 때만 id 값을 받고 그 다음부턴 못바꿈
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) { //누군가가 id를 바꿀려고 코드 짜는 중인데 final해서 못바꿈
        //this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.println("id:" + id + ", name:" + name);
    }
}

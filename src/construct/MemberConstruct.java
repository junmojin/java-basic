package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가 (오버로딩)
    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
        //위에 this랑 밑에 this 중복이라 한 번만 적어서 호출하는 방법은 this() 라는 기능 사용
        //this(name, age, 50); //변경
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

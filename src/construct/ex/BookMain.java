package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        //기본생성자 사용
        Book book1 = new Book();
        book1.displayInfo();

        //title, author만 받는 매개변수 생성자
        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        //모든 필드를 매개변수로 받는 생성자
        Book book3 = new Book("JPA 프로그래밍", "kim", 27);
        book3.displayInfo();
    }
}

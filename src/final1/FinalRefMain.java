package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //final 변경 불가 컴파일 오류, 변수안에 있는 참조값만 변경 못하는건지 인스턴스 값까지 영향가진 않음
        //data = new Data();

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}

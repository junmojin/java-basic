package class1;


    public class Test {
        public static void main(String[] args) {
            Person dudu = new Person("dudu", 24);
            changePerson(dudu);
            System.out.println("Updated name: " + dudu.getName());
        }

        static void changePerson(Person person) {
            person = new Person("sun", 22);
        }
    }


package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); //둘 중하나는 다 적어줘야함 import는 하나만 가능
    }
}

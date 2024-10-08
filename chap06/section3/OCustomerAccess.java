package chap06.section3;

// 자바에서 object 선언의 접근
public class OCustomerAccess {
    public static void main(String[] args) {
        String name = OCustomer.INSTANCE.getName(); // 코틀린의 object 선언 객체의 메소드 접근
        System.out.println(name);
    }
}

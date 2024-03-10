package chap_06;

public class _01_Method {
    // Define the Method
    public static void sayHello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        // Method : acting like function (f(x))
        // 기능을 수행하는 묶음을 매서드라고 한다
        // 어떤 기능을 수행하는 코드들의 묶음, 함수와 같이 작동하는 것이 Method

        // Call the Method
        System.out.println("Before calling the method");
        sayHello();
        System.out.println("After calling the method");

    }
}

package chap_06;

public class _07_VariableScope {
    public static void methodA(){
//        System.out.println(number); // number did not defined yet
//        System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // Local Variable, can use only in methodB area!
    }

    public static void main(String[] args) {
        int number = 3; // Local Variable
//        System.out.println(result); // 다른 메서드에서 정의된 것은 error 뜸

        for (int i = 0; i < 5; i++) { // Local variable - only in for loop
            System.out.println(i);
        }

        // System.out.println(i); // Local variable i

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number); // (o) since it's in {}
        }

//        System.out.println(j); // cannot call outside fo {}

    }
}

package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number){
//        int result = number * number;
//        return result;
        return getPower(number,2);
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) { // repeat - how many times? exponent
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // Why we have to use Method?
        // If there is a problem in codes? > change specific area only once
        // Beneficial for : Maintain & Repair

        // 2 * 2
//        int result = 1;
//        for (int i = 0; i < 2; i++) {
//            result = result * 2;
//        }
//        System.out.println(result);

        System.out.println(getPower(2,2));

//        // 3 * 3 * 3
//        result = 1;
//        for (int i = 0; i < 3; i++) {
//            result = result * 3;
//        }
//        System.out.println(result);
        System.out.println(getPower(3,3));


//        // 4 * 4
//        result = 1;
//        for (int i = 0; i < 2; i++) {
//            result = result * 4;
//        }
//        System.out.println(result);

        System.out.println(getPower(4,2));
    }
}

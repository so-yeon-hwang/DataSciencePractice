package chap_06;

public class _02_Parameter {
    public static void power(int number) {
        // This method have to get value
        int result = number * number; // Parameter
        System.out.println("Power of " + number + " is " + result);
    }
    
    public static void powerByExp(int number, int exponent){
        // 어떤 수(number)의 몇(exponent)승을 구하는 함수
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        System.out.println(number + " to the power of " + exponent + " is equal to " + result);
    }

    public static void main(String[] args) {
        // Parameter 전달값 Conveying value
        // Power Calculation Programming
        // Method - outside of main area

        // 파선아실 | 파라미터 선언, 아규먼트 실제 들어온 값
        // Parameter :
        power(2);
        power(3);

        powerByExp(2,3); // 2*2*2 = 8
        powerByExp(3,3); // 3*3*3 = 27
        powerByExp(10,0); // 1


    }
}

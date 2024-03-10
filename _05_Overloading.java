package chap_06;

public class _05_Overloading {
    public static int getPower(int number){
        int result = number * number;
        return result;
        // return number * number
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber); // Str into > Int
        return number * number; // even tho str, return int result
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        // Method Overloading
        // Using the same name
        // 전달되는 자료형에 따라 이름은 같지만 다른 메서드를 호출해냄
        // 전달값의 개수, 타입이 다를 때 중복해서 선언되는 메서드 : 매서드 오버로딩

        // <Definition>
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다름
        // 2. 전달값의 개수가 다름

        System.out.println(getPower(3));
        System.out.println(getPower("4")); // Input - Str
        System.out.println(getPower(3,3));
    }
}

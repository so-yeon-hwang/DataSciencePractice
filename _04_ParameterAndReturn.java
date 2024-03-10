package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number){
        int result = number * number;
        return result;
        // return number * number
    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        // Method that has Parameter and Return value at the same time
        // 전달값과 반환값을 함께 갖는 매서드 만들기
        int returnValue = getPower(2);
        System.out.println(returnValue); // 2 * 2 = 4


        int retVal = getPowerByExp(3,3); // 3 * 3 * 3 = 27
        System.out.println(retVal);
    }


}

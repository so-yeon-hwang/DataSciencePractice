package chap_06;

public class _Quiz_06_re {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0,index);
        for (int i = 0; i < (data.length()-index); i++) {
            hiddenData = hiddenData + "*";
        }
        return hiddenData;

    }
    public static void main(String[] args) {
        String name = "HSY";
        String ssn = "000825-4040004";
        String phone = "010-2000-8000";

        System.out.println("Name : " + getHiddenData(name,1));
        System.out.println("Social Security Number : " + getHiddenData(ssn,8));
        System.out.println("Phone Number : " + getHiddenData(phone,9));

    }
}

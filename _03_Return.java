package chap_06;

public class _03_Return {
    // Hotel Information Programming
    // Hotel number, address, activity info ...
    // Method that has "Return Value"
    public static String getPhoneNumber(){
        String phoneNumber = "123-456-7890";
        return phoneNumber;
    }

    public static String getAdress(){
        return "AL 36265";
    }

    public static String getActivities(){
        return "Spa, Restaurant, Tennis";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("If you have any question, please call to " + contactNumber);

        String address = getAdress();
        System.out.println("Hotel Address : " + address);

        System.out.println("Hotel Activities : " + getActivities());
    }
}

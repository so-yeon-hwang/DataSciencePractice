package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // Set Delivery Value via "Edit Configurations"
        for (String s : args) {
            System.out.println(s);
        }
// Use Main Method as Library Programming
//        1. Book inquiry
//        2. Book lending
//        3. Returning books

        if (args.length == 1){
            switch (args[0]) {
                case "1":
                    System.out.println("Book inquiry menu");
                    break;
                case "2":
                    System.out.println("Book lending menu");
                    break;
                case "3":
                    System.out.println("Returning books menu");
                    break;
                default :
                    System.out.println("Wrong value");
            }
        }
        else {
            System.out.println("[Manual] choose one among 1 to 3");
        }
    }
}

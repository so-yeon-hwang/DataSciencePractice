package chap_04;

public class _LoopApplication {
    public static void main(String[] args) {

        // Nested Loop 이중 반복문
        // * asterisk -> square 5x5

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println(); // line break
        }
        System.out.println("===================");

        // Making triangle via nested loop
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===================");
        // right-leaning stars
        // ssss*
        // sss**
        // ss***
        // s****
        // *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("s");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("==============");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        /// 09 Multiple Table ///
        for (int i = 2; i < 10 ; i++) {
            for (int j = 1; j < 10 ; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

        /// 10 break ///


        // Break
        // Only 20 chickens per one day! (1 person 1 chicken)
        // 50 customers

        // for loop
        int max = 20;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println("Order number " + i + " is ready");
            if (i == max){
                System.out.println("Sold out");
                break; // escape the loop
            }
        }
        System.out.println("Out of ingredients - hope you see you tmrw");

        System.out.println("------------------------------------");
        // while loop
        int number = 1; // waiting number
        while (number <= 50) {
            System.out.println("Order number " + number + " is ready");
            if (number == max) {
                System.out.println("Sold out");
                break;
            }
            number++;
        }
        System.out.println("Out of ingredients - see u tmrw! ");


        /// 11 Continue ///
        // continue
        // suppose that there is a no-show costumer

        max = 20; // maximum chicken
        int sold = 0;
        int noShow = 17; // did not show up

        for (int i = 1; i <=50 ; i++) {
            System.out.println("Waiting number " + i + " is ready.");
            // Someone should actually take chicken, but if a costumer did not come properly?
            if (i == noShow){
                System.out.println("Costumer number " + i + " did not show up");
                continue;
                // do not proceed below lines, but just proceed another increment i+=1
                // go to next step if we meet "continue"
            }
            sold++ ;
            if (sold == max){
                System.out.println("Sorry, sold out");
                break;
            }
        }
        System.out.println("See you tomorrow");

        System.out.println("-------------------------");
        // while & continue
        int index = 0; // costumer number
        sold = 0;
        while (index <= 51){
            index++;
            System.out.println("Waiting number " + index + " is all ready");

            // what if the costumer did not come up properly, !?
            if (index == noShow){
                System.out.println("Waiting number " + index + " did not show up!");
                continue; // do not proceed below, but just go back to the top
            }

            sold++;
            if (sold == max){
                System.out.println("All sold out for today :(");
                break;
            }
        }
        System.out.println("See you tomorrow");

        /// Quiz ///
        // Parking lot fee Program

        int hour = 10;
        boolean isLightCar = false; // 50% off
        boolean disabled = true; // 50% off

        int fee = hour * 4;
        // No matter how long you park, maximum fee is $30

        if (fee > 30) {
            fee = 30;
        }

        // 50% off
        if (isLightCar || disabled) {
            fee *= 0.5f;
        }

        // print the result
        System.out.println("Parking fee is $" + fee);

    }
}

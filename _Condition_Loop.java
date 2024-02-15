package chap_04;

public class _Condition_Loop {
    public static void main(String[] args) {

        // Conditional Statement | If
        // (ex) Order coffee only before 2PM
        int hour = 16; // 10AM
        if (hour < 14) {
            System.out.println("One iced coffee");
            System.out.println("add half&half");
        } // implement all sentences in braces{} | Bind two actions into one via braces
        // if one action sentence only - {} is not necessary
        System.out.println("Order completed #1");


        // (ex) Do not exceed two cups of coffee per a day | If I had a coffee in the morning, no more coffee consumption
        // two conditions!

        hour = 10;
        boolean morningCoffee = false;
        // if ( (hour < 14) && (morningCoffee == false)); {
        if ( (hour < 14) && (!morningCoffee)); { // !morningCoffee == false
            System.out.println("One iced coffee");
        }
        System.out.println("Order completed #2");

        // After 2PM or Already had coffee ? > decaf (\\)
        hour = 15;
        morningCoffee = true;

        if (hour > 14 || morningCoffee == true) {
            System.out.println("One Decaf Iced Coffee");
        }
        System.out.println("Order Completed #3");



        // Conditional Statement - If Else

        hour = 16;
        if (hour < 14)
            System.out.println("One Iced coffee");
        else
            System.out.println("One Iced coffee - Decaf Option");
        System.out.println("Order Completed #1");

        // Two conditions

        hour = 10;
        morningCoffee = false;
        if (hour > 14 || morningCoffee == true) {
            System.out.println("One Iced coffee - Decaf Option");
        }
        else
            System.out.println("One Iced coffee");
        System.out.println("Order Completed #2");

        // Conditional Statement - ElseIf

        // if there's cafe mocha, get one
        // elif there's chocolate latte, get one
        // else just iced coffee, get one

        boolean mocha = false; // exist or not
        boolean chocolate = false;
        boolean orange = true;

        if (mocha) {
            System.out.println("One cafe mocha");
        } else if (chocolate) {
            System.out.println("One chocolate latte");
        }
        else
            System.out.println("One Iced Coffee");
        System.out.println("Order Completed #1");

        /// multiple else-if usage (o)
        if (mocha) {
            System.out.println("One cafe mocha");
        } else if (chocolate) {
            System.out.println("One chocolate latte");
        } else if (orange) {
            System.out.println("One Orange juice");
        } else
            System.out.println("One Iced Coffee");
        System.out.println("Order Completed #2");

        // 1st : full scholarship
        // 2nd : half scholarship
        // 3rd : half scholarship
        // else : full payment :)


        // If-Else
        int ranking = 4;
        if (ranking ==1) {
            System.out.println("Full scholarship");
        } else if (ranking == 2) {
            System.out.println("Half scholarship");
        } else if (ranking == 3) {
            System.out.println("Half scholarship");
        } else
            System.out.println("No scholarship for this semester :(");
        System.out.println("Checking all finished :)  #1");


        // Switch case
        ranking = 4;
        switch (ranking) {
            case 1:
                System.out.println("Full scholarship");
                break;
            case 2:
                System.out.println("Half scholarship");
                break;
            case 3:
                System.out.println("Half scholarship");
                break;
            default:
                System.out.println("No scholarship for this semester");

        }
        System.out.println("Checking all finished :)  #2");


        // duplicated sentences : case 2 & 3 combining
        // if there's specific case, use switch case

        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("Full scholarship");
                break;
            case 2: // if ranking == 2 : case 3 sentence implements
            case 3:
                System.out.println("Half scholarship");
                break;
            default:
                System.out.println("No scholarship for this semester");
        }
        System.out.println("Your ranking of former semester is " + ranking);
        System.out.println("Checking all finished :)  #3");


        // Used Goods Selling : price depends on grade
        int grade = 1;
        int price = 7; // basic price
        switch (grade) {
            case 1:
                price += 1; // if there's no break, implement below sentences in a row
            case 2:
                price += 1;
            case 3:
                price += 1;
        }
        System.out.println("Grade " + grade + " is $" + price);

        // Loop : for
        // for (declare;condition;increment) {}

        for (int i = 0; i < 10 ; i++ ) {
            System.out.println("Welcome to Starbucks! " + i);}

        // Even numbers only
        for (int j = 0; j < 10 ; j += 2) {
            System.out.print(j);
        }
        System.out.println();

        // odds
        for (int j = 1; j < 10 ; j = j+2 ) {
            System.out.print(j);
        }
        System.out.println(); // line break

        // Print numbers in reversed order
        for (int i = 5 ; i > 0 ; i -= 1) {
            System.out.print(i);
        }
        System.out.println();

        // 1 + 2 + ... 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        } System.out.println(sum);

        // Loop : while
        // Swimming

        int distance = 25 ; // total distance
        int move = 0 ; // current distance

        while ( move < distance ) {
            System.out.println("Keep swimming");
            System.out.println("Current location : " + move);
            move += 3;
        }
        System.out.println("Arrived");

        // infinite loop




        // Loop Do While
        distance = 25;
        move = 0;
        int height = 2; // 2 meter height

        while ((move + height) < distance) {
            System.out.println("Keep swimming");
            System.out.println("Current Location : " + move);
            move += 3;
        }
        System.out.println("arrived");
        System.out.println("=====loop#1======");
        // That dude's height is insane
        // Loop even did not worked since the condition is always false
        move = 0;
        height = 25;

        while ((move + height) < distance) {
            System.out.println("Keep swimming");
            System.out.println("Current Location : " + move);
            move += 3;
        }
        System.out.println("arrived");
        System.out.println("=====loop#2======");
        System.out.println("=====Do while loop======");

        // Do While Loop
        // If condition is true, "do" parts will be repeated

        do {
            System.out.println("Keep Swimming");
            System.out.println("Current Location : " + move );
            move += 3;
        } while (move + height < distance ) ;
        System.out.println("Arrived");
    }
}

```java
package chap_01;

public class _02_DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("This is Java Workspace");
        System.out.println(825);
        System.out.println(-22);
        System.out.println(3.14);
        System.out.println(true);
        System.out.println(false);

        System.out.println(13+22);
    }
}

package chap_01;

public class _03_variables {
    public static void main(String[] args) {
        String name = "Soyeon";
        int hour = 7;

        System.out.println("Dear " + name + ", your application had been accepted at " + hour);
        System.out.println("Dear " + name + ", this is your order receipt");

        double score = 90.5;
        char grade = 'A';
        name = "Julie";

        System.out.println("The average score of " + name + " is " + score);
        System.out.println("The final grade is " + grade);

        boolean pass = true;
        System.out.println("Did you passed the test? : " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

    }
}


package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(Before 10 min) The wedding's gonna start soon.");
        //System.out.println("(Before 5 min) The wedding's gonna start soon.");
        //Not gonna be programmed
        System.out.println("The wedding's just started.");

        int size = 6; // feet size of my nephew
        size = size + 1; // my nephew grows so fast!! We need a bigger one than current size :)
        System.out.println("Can I get size " + size + " of sneakers?");


        int a = 10;
        int b = 20;
        System.out.println(a + b);
//                ctrl + '/' : Making comment!  or for more than two sentences, ctrl + shift + /
    }
}


package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // How to name variable?
        // (1) Should be matched with meaning
        // (2) _, character, number (o) | blank not permitted
        // (3) Should be started with underscore or character
        // (4) a word or two more characters in a row
        // (5) Begins with small letter, and every first character of word should be Capital Letter

        // Going Abroad
        String nationality = "Korea";
        String firstName = "Soyeon";
        String lastName = "Hwang";
        String date_of_birth = "2000-08-25";
        String residentialAddress = "Dragonfly Inn";
        String purpose_of_visit = "Travel";
        String flightNo = "KE127";
        String _flightNo = "KE127";

        int accompany = 2;
        int lengthOfStay = 7;

        String item1 = "chocolate";
        String item2 = "flower";
        // String 3item = "perfume";

        // Define Constant in Capital Letter | Unchangeable > final
        final String CODE = "KR";




    }
}

package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; // country number // constants value
        // KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);
        // constants never change

        final double PI = 3.14592; // constants
        final String DATE_OF_BIRTH = "2000-08-25";
    }
}

package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 Type Casting
        // int > float | float > int

        // from int to float or double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score);

        // from float or double to int
        float score_f = 95.3F; // 95
        double score_d = 98.8; // 98
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        // int + float
        score = 93 + (int)93.8;
        System.out.println(score);

        score_d = (double)93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        // Put converted value in a variable
        double convertedScoreDouble = score; //automatic type casting


        int convertedScoreInt = (int) score_d; // 191.8 ->191
        // double -> float -> long -> int (manually)

        // from number data to string type
        String s1 = String.valueOf(93); // from String. Class - using function
        s1 = Integer.toString(93); // string to int
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // result : string (98.8)

        // From String into Number data
        int i = Integer.parseInt("93"); // parsing
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int error = Integer.parseInt("java"); // deliberate error case
//        all values should be proper

    }
}


package chap_01;

public class _08_Quiz_01 {
    public static void main(String[] args) {
        String busInfo = "JAX08";
        int timeMinute = 3;
        float distance = 1.2F;

        System.out.println(busInfo + " bus");
        System.out.println("Departure after about " + timeMinute + "minute");
        System.out.println(distance + " miles left");

    }
}
package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // arithmetic operators 산술 연산자

        // general arithmetic operators
        System.out.println(4+2); // 6
        System.out.println(8-3); // 5
        System.out.println(2*3); // 6
        System.out.println(8/2); // 4

        System.out.println(5/2); // not 2.5 but 2 (int form)
        System.out.println(2/4); // not 0.5 but 0
        System.out.println(4%2); // 0 : residuals
        System.out.println(5%2); // 1

        // Priority operators
        System.out.println( 2 + 2 * 2); // 6
        System.out.println( (2+2) * 2); // 8
        System.out.println(2 + (2*2) ); // 6

        // Operators using variables
        int a = 20 ;
        int b = 10 ;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b ;
        System.out.println(c);

        c = a % b ;
        System.out.println(c);

        // increase | decrease operators ++,--
        int val;

        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 : add 1 first before implement the code
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 implement the code based on "val", and then add 1
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); //9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9


        // Waiting Number Ticket //
        int waiting = 0;
        System.out.println(waiting++ + " people are waiting"); // ppl ; 0
        System.out.println(waiting++ + " people are waiting"); // ppl ; 1
        System.out.println(waiting++ + " people are waiting"); // ppl ; 2

        System.out.println("Total number of people waiting : " + waiting); // 3
    }
}

```

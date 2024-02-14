package chap_03;

public class _chap_03_String {
    public static void main(String[] args) {
        String s = "I like Java, Python and C.";
        System.out.println(s);

        // Length of String
        System.out.println(s.length()); // 26

        // Transformation - Upper & Lower
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // Inclusion Relationship

        // act like - .isin()
        // if included > true | or if not > false
        System.out.println(s.contains("Java")); // true , included
        System.out.println(s.contains("sql")); // false , not included

        System.out.println(s.indexOf("Java")); // return index location info of "Java"
        System.out.println(s.indexOf("sql")); // -1 == not included

        String ss = "One chocolate latte and two vanilla latte";
        System.out.println(ss.indexOf("latte")); // print first "latte"
        System.out.println(ss.lastIndexOf("latte")); // print last "latte"

        System.out.println(s.startsWith("I like")); // starting with " " ? > true
        System.out.println(s.startsWith("Do you like")); // starting with " " ? > false
        System.out.println(s.endsWith(".")); // ends with " " > true
        System.out.println(s.endsWith("?")); // ends with " " > false


        s = "I like Java, Python and C.";
        ss = "One chocolate latte and two vanilla latte";

        // String Transformation
        System.out.println(ss.replace("latte", "frappuccino"));
        System.out.println(s.substring(7)); // Starting Index number : crop front part, not saved as s to directly
        System.out.println(s.substring(s.indexOf("Java"))); // s.indexOf("Java") == 7
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // include beginning "J" but not ending "."

        // Remove Spaces
        s = "      I love zero cokes.     ";
        System.out.println(s);
        System.out.println(s.trim()); // remove all spaces L&R

        // Combining
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + ", " + s2); // Java, Python
        System.out.println(s1.concat(", ").concat(s2)); // Java, Python


        // String Comparison
        s1 = "Java";
        s2 = "Python";

        System.out.println(s1.equals(s2)); // Are they same or not? T/F
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false
        System.out.println(s2.equalsIgnoreCase("python")); // true // No comparison btw upper&lower | contents only

        // ADVANCED //

        s1 = "1234"; // Password information
        s2 = "1234";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); // true - comparing *CONTENTS* of strings
        System.out.println(s1 == s2); // false - comparing memory location of strings
        // different data storage location - source of reference is discrete
        // 다른 메모리 공간을 참조하므로, != 결과값이 나온다.


        // Escape Character, Escape Character, Special Character
        // perform special, specific function
        // \n \t \\ \" \'

        // \n : Line break
        System.out.println("Java");
        System.out.println("is");
        System.out.println("fascinating");
        System.out.println("Java\nis\nfascinating"); // Line Break

        // \t : tab
        System.out.println("Chocolate\t$2");
        System.out.println("Milk\t\t$3");

        // \\ : "\"
        System.out.println("C:\\Program Files\\Java");

        // \" : "
        System.out.println("That guy said \"No\" in front of everyone");

        // \' : '
        System.out.println("She thought \'This is what I've been looking for!\'");
        System.out.println("She thought 'This is what I've been looking for!'");

        char c = 'a'; // we have to use not " but ' when it comes to char
        c = '\'';
        System.out.println(c);

        //quiz//

        String SN = "000825-4147774"; // social number
        System.out.println(SN.substring(0,8));
        System.out.println(SN.substring(0,SN.indexOf("-") + 2 ));
        // two steps after hyphen
        // SN.indexOf("-") == 6




    }
}

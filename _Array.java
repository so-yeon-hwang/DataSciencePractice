package chap_05;

public class _Array {
    public static void main(String[] args) {
        // for github update
        ///// _01_Array //////
        // Array: A contiguous space that stores multiple values of the same data type.
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        // Example : Ordering coffee
        String coffeeRoss = "Iced Coffee";
        String coffeeRachel = "Mocha";
        String coffeeChandler = "latte";
        String coffeeMonica = "Caramel latte";

        System.out.println("one " + coffeeRoss);
        System.out.println("one " + coffeeRachel);
        System.out.println("one " + coffeeChandler);
        System.out.println("one " + coffeeMonica);
        System.out.println("please");


        // Using Array
        // Declaring Array (1st method)
//        String[] coffees = new String[4]; // declare an array size of 4
//
//        // Declaring Array (2nd method)
//        // String coffees[] = new String[4];
//
//        coffees[0] = "Iced Coffee"; // Index number always starts with zero.
//        // 배열의 첫 번째 요소에 Iced Coffee가 들어감
//
//        coffees[1] = "Mocha";
//        coffees[2] = "Latte";
//        coffees[3] = "Caramel Latte";

        // Declaring & Defining(Putting the source) Array at the same time
        // Declaring Array (3rd Method)

//        String[] coffees = new String[] {"Iced Coffee","Mocha","Latte","Caramel Latte"};
        // Don't define the size of array

        // Declaring Array (4th Method)
        String[] coffees = {"Iced Coffee","Mocha","Latte","Caramel Latte"};

        System.out.println("==================w/Array======================");
        // Ordering coffee
        System.out.println("One " + coffees[0]);
        System.out.println("One " + coffees[1]);

        // menu change issue!
        coffees[2] = "Espresso";

        System.out.println("One " + coffees[2]);
        System.out.println("One " + coffees[3]);
        System.out.println("Please");



        double[] d = new double[] {10.0, 11.2, 11.5};

        boolean[] b = {true, true, false};


        ///// _02_ArrayLoop //////
        // Array Loop 배열의 순회
        String[] coffees2 = {"Iced Coffee","Mocha","Latte","Caramel Latte"};
        System.out.println("One " + coffees2[0]);
        System.out.println("One " + coffees2[1]);
        System.out.println("One " + coffees2[2]);
        System.out.println("One " + coffees2[3]);

        // Since the index number is increasing by 1, we can try loop!

        System.out.println("================w/Loop===================");
        for (int i = 0; i < 4; i++) {
            System.out.println("One " + coffees2[i]);
        }
        System.out.println("Please");

        System.out.println("---------------------------------");

        // How to know the length of Array?
        // >> coffees.length
        for (int i = 0; i < coffees.length; i++) {
            System.out.println("One " + coffees[i]);
        }
        System.out.println("Please");

        System.out.println("---------------------------");

        // enhanced for (for-each) loop
        // each : 배열의 값을 처음부터 끝까지 다 돈다, 배열의 모든 요소 순회
        for (String coffee : coffees) {
            System.out.println("One " + coffee);
        }
        System.out.println("Please");

        ///// _03_MultiArray //////
        // Multiple Dimension Array (esp, 2D)

        // (ex) Movie theater seats
        // A1 - A5
        // B1 - B5
        // C1 - C5

        // Three one dimensional arrays
        String[] seatA = {"A1","A2","A3","A4","A5"};
        String[] seatB = {"B1","B2","B3","B4","B5"};
        String[] seatC = {"C1","C2","C3","C4","C5"};

        // Let's combine into one array | 3 by 5 size 2D array
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        // How to access to B2?
        System.out.println(seats[1][1]);

        // C5
        System.out.println(seats[2][4]);

        ////// Another Type of Movie theater example ///////
        // first line 3, second line 4, third line 5 seats

        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        // How to access to A3?
        System.out.println(seats2[0][2]);

        // What if we try to access A5? (Does not exist)
//        System.out.println(seats2[0][4]); // Error!!

        // Building 3D array
        String[][][] marray = new String[3][3][3];

        ///// _04_MultiArrayLoop //////
        // 다차원 배열 순회 MutliArray Loop
//        String[][] seats = new String[][] {
//                {"A1","A2","A3","A4","A5"},
//                {"B1","B2","B3","B4","B5"},
//                {"C1","C2","C3","C4","C5"}
//        };

        // 2차원 배열 순회할 경우 이중 반복문을 사용한다

        for (int i = 0; i < 3 ; i++) { // 세로위치
            for (int j = 0; j < 5; j++) { // 가로위치
                System.out.print(seats[i][j] + " "); // sout에서 ln 없애서 붙여쓰기
            }
            System.out.println(); // 줄바꿈
        }


        System.out.println("==========================");
        // Another type of Movie Theater //

//        String[][] seats2 = {
//                {"A1","A2","A3"},
//                {"B1","B2","B3","B4"},
//                {"C1","C2","C3","C4","C5"}
//        };

        for (int i = 0; i < seats2.length ; i++) { // 세로길이
            for (int j = 0; j < seats2[i].length ; j++) { // 가로위치
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }
        // 없는 A4, A5를 반복문에서 요구하면, ERROR!!
        // seats2.length[i]를 활용하여 길이의 limit을 형성한다

        System.out.println("-----------------------------------");
        // 10x15 size of Movie theater seats information
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"}; // 10

        for (int i = 0; i < seats3.length; i++) { // 세로에 해당하는 반복문 처리
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j+1);
            }
        }

        // Buying the ticket
        // allocate new array source to sold seats
        seats3[7][8] = "xx"; // H9
        seats3[7][9] = "xxx"; // H10

        // checking the theater info
        for (int i = 0; i < seats3.length ; i++) { // 세로길이
            for (int j = 0; j < seats3[i].length ; j++) { // 가로위치
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }

        ///// _05_ASCII //////

        // ASCII Code (from ANSI) : USA standard code
        char c = 'A'; // alphabet capital letter starts from 65, small letter from 97, number(0) from 48
        System.out.println(c);
        System.out.println((int)c); // ASCII code number

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        c = 'a';
        System.out.println(c);
        System.out.println((int)c); // ASCII code number

        c = 'b';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        /// Movie Theater Example w/ASCII code ///
        // 10x15 size of Movie theater seats information
        // String[][] seats3 = new String[10][15];
        char ch = 'A';


        // allocating value with ASCII code
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j+1);
            }
            ch++;
        }

        // Print
        for (int i = 0; i < seats3.length ; i++) {
            for (int j = 0; j < seats3[i].length ; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }


        //////// Quiz /////////////
        // quiz : 10 different sizes of shoes
        int[] size = new int[10]; // Make an empty array

        for (int i = 0; i < 10; i++) { // 10 ==  size.length
            size[i] = 250 + i*5;
            System.out.println("size " + size[i] + " (In stock)");
        }




    }

}

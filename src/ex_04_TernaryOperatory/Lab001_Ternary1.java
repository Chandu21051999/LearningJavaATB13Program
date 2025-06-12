package ex_04_TernaryOperatory;

public class Lab001_Ternary1 {

    public static void main(String[] args) {

        // Age to vote?
        int age = 10;
        String canIVote = age > 18 ? "Yes" : "No";
        System.out.println(canIVote);

        int number = -5;
        // Is Number: positive or negative
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);

        // The min number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));

        int min = x < y ? x : y;
        System.out.println(min);

        // The maximum number between two numbers by using ternary operator.
        int x2 = 10;
        int y2 = 20;
//        System.out.println(Math.max(x,y));

        int max = x2 > y2 ? x2 : y2;
        System.out.println(max);

        int num = 13;
        String result2  = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(result2);

        // age = 23
        //  age < 18 ->  Minor
        //  18 < age > 65 ->  Adult
        // age > 65 -> Senior Citizen
        int age2 = 76;
        String result3 =  (age2 < 18 ) ? "Minor" : (age2 < 65) ? "Adult": "Senior";
        System.out.println(result3);

        // Find the maximum between the three numbers.
        // Now we will be using the logic building formula.

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1  > n3 -> n1
        // n2 > n3 and n2>  n1 ->  n2
        // n3

        // Step 3
//        int max = (n1> n2) ? A : B;
        int max2 = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        // A -> (n1 > n3) ? n1 : n3
        // B -> ( n2> n3) ? n2 : n3
        System.out.println(max2);
    }
}

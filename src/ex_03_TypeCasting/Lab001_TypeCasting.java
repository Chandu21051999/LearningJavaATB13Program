package ex_03_TypeCasting;

public class Lab001_TypeCasting {
    public static void main(String[] args) {


        byte b = 10;
        int a = b; //  Widening -> Implicit Casting
        int a1 = (int) b; // Widening -> Explicit Casting

        //Narrowing
        int val = 300;
        //        byte b = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b1 = (byte) val; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        // Data Loss.
        System.out.println(b1);

        long phone = 9876543210l;
        //        short s = phone; // Implicit Narrow?
        short s1 = (short) phone; // Explicit Narrow?

        int course = 100;
        float GST = 18.45f;
        //        int total = course+GST; // Narrow - Implicit
        int total1 = course + (int) GST; // Narrow - Explict
        System.out.println(total1);


        float total2 = course + GST; // Widening - auto - implicit
        float total3 = (float) course + GST; // Widening  - Explicit
        System.out.println(total2);
        System.out.println(total3);

    }
}
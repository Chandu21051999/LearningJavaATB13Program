package ex_03_TypeCasting;

public class Lab003_Narrowing {
    public static void main(String[] args) {

        //Program 5: Explicit Typecasting (Narrowing)
        //Description: Casts a double to an int, cutting off decimals value.
        double D = 10.456;
        int A = (int) D;
        System.out.println("Double value D: " + D);
        System.out.println("Int value A (after narrowing): " + A);
    }
}

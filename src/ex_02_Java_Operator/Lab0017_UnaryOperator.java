package ex_02_Java_Operator;

public class Lab0017_UnaryOperator {
    public static void main(String[] args) {

        //+10-optional
        //- is not optional
       // int a=+10;
        //int a1=-100;

        // Unary Operator
        int a = +10;
//        int a = 10; optional
        int a1 = -110;
        int result = a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);


        int b = -1;
        b = b+1;
        System.out.println(b);

    }
}

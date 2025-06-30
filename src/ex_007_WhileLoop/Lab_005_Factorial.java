package ex_007_WhileLoop;

import java.util.Scanner;

public class Lab_005_Factorial {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the factorial progran/Enter to the number");
        if (!sc.hasNextInt()) {

            System.out.println("ENter into the fool");
            return;
        }

        int number=sc.nextInt();
        long factorial=1;

        if(number<0){
            System.out.println("Negative factorial is not allowed");
        }

        if(number<0){
            System.out.println(factorial);
        }else {
            for(int i=1;i<=number;i++){
                factorial=factorial*i;
            }
        }

        System.out.println("Factorial is:"+ factorial);
    }

}

package ex_Task_programs;

import java.util.Scanner;

public class Lab_001_Triangle {
    public static void main(String[] args) {
        /*
        we have tp enter three input values
        condition like add and one value compare with bigger number
        =>a+b+c
        ->a+b>c && a+c>b && b+c>a -first add the sides and one side it is greater
        all sides are equal=equilateral
        2 sides equal= isosceles
        not equal scalene
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        int a= scanner.nextInt();
        System.out.println("Enter b value");
        int b= scanner.nextInt();
        System.out.println("Enter c value");
        int c= scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles");
            } else {
                System.out.println("The triangle is Scalene");
            }

        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
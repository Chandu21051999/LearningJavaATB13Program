package ex_05_SwitchStatement;

import java.util.Scanner;

public class Lab_001_Switch1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1 to 7 days");
        int day= scanner.nextInt();
        switch (day){
            case  1:
                System.out.println("Monday");
                break;
            case  2:
                System.out.println("Tuesday");
                break;
            case  3:
                System.out.println("wednesday");
                break;
            case  4:
                System.out.println("Thursday");
                break;
            case  5:
                System.out.println("Friday");
                break;
            case  6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }

    }
}

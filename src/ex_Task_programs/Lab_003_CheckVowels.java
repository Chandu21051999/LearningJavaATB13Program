package ex_Task_programs;

import java.util.Scanner;

public class Lab_003_CheckVowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character");
        String input = scanner.nextLine();

        input = input.toLowerCase();
        int VowelCount = 0;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                VowelCount++;
            }
        }

        if (VowelCount > 0) {
            System.out.println("The string contains " + VowelCount + "Vowels");

        } else {
            System.out.println("No Ovwels found");
        }
    }

    }

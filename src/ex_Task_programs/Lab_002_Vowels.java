package ex_Task_programs;

public class Lab_002_Vowels {
    public static void main(String[] args) {

        String input = "Chandrakala";
        CountVowelsandConsonents(input);
    }

    private static void CountVowelsandConsonents(String str) {
        int vowels=0,Consonants=0;
        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>= 'a' && ch<='z'){

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                  vowels++;

                }
                else{
                    Consonants++;
                }
            }
    }
        System.out.println("Input String:"  + str);
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:"  + Consonants);

    }
}

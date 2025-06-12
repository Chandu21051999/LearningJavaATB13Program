package ex_04_TernaryOperatory;

public class Lab004_Ternanry2 {
    public static void main(String[] args) {

        int marks = 90;

        String result = (marks >= 90) ? "A+" : (marks >= 75) ? "a" : (marks>=60 ) ? "B" : (marks >=40) ? "C" : "fail";

        System.out.println(result);

    }
}

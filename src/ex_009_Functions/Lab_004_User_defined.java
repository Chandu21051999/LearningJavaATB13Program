package ex_009_Functions;

public class Lab_004_User_defined {

    public static void main(String[] args) {

        int result=sum_of_number(3,5);
        sum_of_numbers_no_return(3,1);
        System.out.println(result);
    }

    static int sum_of_number(int a , int b){
        return a+b;
    }

    static void sum_of_numbers_no_return(int a , int b){
        System.out.println(a+b);
    }
}

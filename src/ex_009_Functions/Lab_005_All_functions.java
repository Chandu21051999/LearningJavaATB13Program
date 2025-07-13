package ex_009_Functions;

public class Lab_005_All_functions {

  //  1. Without Parameters and Without Return Type.
    //2. Without Parameters but With Return Type
  // 3. With Parameters and Without Return Type
// 4. With Parameters and With Return Type.

    public static void main(String[] args) {
        //1. Without Parameters and Without Return Type
        wp_wr_greet();
        //2.Without Parameters but With Return Type
        String msg= greet_with_wp_with_return();
        System.out.println(msg);

        //3. With Parameters and Without Return Type
        greet_with_details("ajay",25,35000);
        greet_with_details("vijay",24,23000);

        //4.With Parameters and With Return Type.
        int sum= sum_of_two_numbers(3,5);
        int sum2=sum_of_two_numbers(32,655);
        int sum3=sum_of_two_numbers(5265,84488);
        int sum4= sum_of_two_numbers(547,56320);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

        int result =Math.max(2,7);

    }
    //1. Without Parameters and Without Return Type
    static void wp_wr_greet(){
        System.out.println("Type 1:1. Without Parameters and Without Return Type");
        System.out.println("HEllo how are you");
    }

    //Without Parameters but With Return Type
    static String greet_with_wp_with_return(){
        System.out.println("Type:2 -Without Parameters but With Return Type");
        System.out.println("hi");
        return "how are you";
    }
    static void greet_with_details(String name, int age ,double salary){
        System.out.println("Type-3: With Parameters and Without Return Type");
        System.out.println("your name is:"+ name+ "\n your age is" +age+ "\nyour salary" +salary);
    }

    //With Parameters and With Return Type.
    static int sum_of_two_numbers(int a ,int b){
        return a+b;
    }
}

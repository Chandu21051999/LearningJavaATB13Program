package ex_06_Loops;

public class Lab_009_Loop1 {
    public static void main(String[] args) {


     for (int i = 0; i <= 50; i++) { // 0 to 50, 51 Times
        if (i % 2 == 0) {
            continue;
        }
        System.out.println("Odd ->" + i);
    }
  }
}

package core_level_programming.number_programming;
import java.util.Scanner;

//WAPT count the numbers from m to n
public class Q004 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the num1 : ");
   int a = sc.nextInt();
   System.out.print("Enter the num2 : ");
   int b = sc.nextInt();
   CommomCheck.orderCheck(a, b);
   System.out.println("Count is " + (b - a));
  } catch (Exception e) {
   System.out.println(e.getMessage());
  } finally {
   sc.close();
  }
 }
}

package core_level_programming.number_programming;
import java.util.Scanner;
//WAPT swap two numbers
public class Q005 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the num1 : ");
   int a = sc.nextInt();
   System.out.print("Enter the num2 : ");
   int b = sc.nextInt();
   a = a + b;
   b = a - b;
   a = a - b;
   System.out.println("num1 : " + a + ", num2 : " + b);
  } catch (Exception e) {
   System.out.println("Invalid Number!!!");
  } finally {
   sc.close();
  }
 }
}

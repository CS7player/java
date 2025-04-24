import java.util.Scanner;
//WAPT swap two numbers
public class Q006 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the num1 : ");
   int a = sc.nextInt();
   System.out.print("Enter the num2 : ");
   int b = sc.nextInt();
   int c = b;
   b = a;
   a = c;
   System.out.println("num1 : " + a + ", num2 : " + b);
  } catch (Exception e) {
   System.out.println("Invalid Number!!!");
  } finally {
   sc.close();
  }
 }
}

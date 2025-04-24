
import java.util.Scanner;

//WAPT check whether the given number is even or odd
class q001 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number : ");
  try {
   int num = sc.nextInt();
   if (num % 2 == 0) {
    System.out.println("Even Number");
   } else {
    System.out.println("Odd Number");
   }
  } catch (Exception e) {
   System.out.println("Invalid Number;");
  } finally {
   sc.close();
  }
 }
}

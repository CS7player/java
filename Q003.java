package core_level_programming.number_programming;
import java.util.Scanner;
//WAPTP product of the numbers between m to n
public class Q003 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the num1 : ");
   int a = sc.nextInt();
   System.out.print("Enter the num2 : ");
   int b = sc.nextInt();
   orderCheck(a, b);
   int product = 1;
   for (int i = a; i < b; i++) {
    product = product * i;
   }
   System.out.println("product is " + product);
  } catch (WrongOrderException e) {
   System.out.println("Invalid Order!!!");
  } catch (Exception e) {
   System.out.println("Invalid Number!!!");
  } finally {
   sc.close();
  }
 }

 public static void orderCheck(int a, int b) throws WrongOrderException {
  if (a > b) {
   throw new WrongOrderException();
  }
 }

 static class WrongOrderException extends RuntimeException {
 }

}

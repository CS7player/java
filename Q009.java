package core_level_programming.number_programming;
import java.util.Scanner;
//WAPTP cube of a given number
public class Q009 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the number : ");
   int a = sc.nextInt();
   System.out.println("Square : "+ (a*a*a));
  } catch (Exception e) {
   System.out.println("Invalid Number!!!");
  } finally{
   sc.close();
  }
 }
}

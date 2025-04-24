import java.util.Scanner;
//WAPTP square of a given number
public class Q008 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the number : ");
   int a = sc.nextInt();
   System.out.println("Square : "+ (a*a));
  } catch (Exception e) {
   System.out.println("Invalid Number!!!");
  } finally{
   sc.close();
  }
 }
}

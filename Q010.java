import java.util.Scanner;
//WAPTP factorial value of a number
public class Q010 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the number : ");
   int a = sc.nextInt();
   CommomCheck.IsNegativeCheck(a);
   int factorial = 1;
   for (int i = 1; i <= a; i++) {
    factorial *= i;
   }
   System.out.println("Factorial : " + factorial);
  } catch (MyEXceptions.NegativeNumberException e) {
   System.out.println(e.getMessage());
  } catch (Exception e) {
   System.out.println("Invalid Number!!!");
  } finally {
   sc.close();
  }
 }
}

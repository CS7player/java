package core_level_programming.number_programming;
import java.util.Scanner;
//WAPTP factors of a number
public class Q011 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the number : ");
   int a = sc.nextInt();
   CommomCheck.IsNegativeCheck(a);
   String factors = "1";
   for(int i=2;i<=a;i++){
    if(a%i==0){
     factors += ","+i;
    }
   }
   System.out.println("factors : "+ factors);
  } catch (MyEXceptions.NegativeNumberException e) {
   System.out.println(e.getMessage());
  } catch (Exception e) {
   System.out.println("Invalid Number!!!");
  } finally {
   sc.close();
  }
 }
}

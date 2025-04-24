import java.util.Scanner;
//WAPT power from m to n
public class Q013 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the base : ");
   int a = sc.nextInt();
   System.out.print("Enter the power : ");
   int b = sc.nextInt();
   CommomCheck.IsNegativeCheck(a);
   CommomCheck.IsNegativeCheck(b);
   int result  = 1;
   for(int i=0;i<b;i++){
    result *= a;
   }
   System.out.println("result is " + result);
  } catch (Exception e) {
   System.out.println(e.getMessage());
  } finally {
   sc.close();
  }
 }
}
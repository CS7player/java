package core_level_programming.pattern_programs;
import core_level_programming.number_programming.CommomCheck;
import java.util.Scanner;

public class Q002 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the num : ");
  try {
   int a = sc.nextInt();
   CommomCheck.IsNegativeCheck(a);
   for (int i = 0; i < a; i++) {
    for (int j = 0; j < a; j++) {
     if(i==0 || j==0 || i==a-1 || j==a-1){
       System.out.print('*');
     }else{
      System.out.print(" ");
     }
    }
    System.out.println();
   }
  } catch (Exception e) {
   System.out.println(e.getMessage());
  } finally {
   sc.close();
  }
 }
}

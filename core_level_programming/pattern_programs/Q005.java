package core_level_programming.pattern_programs;
import java.util.Scanner;

import core_level_programming.number_programming.CommomCheck;
public class Q005 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("enter the num : ");
   int a = sc.nextInt();
   CommomCheck.IsNegativeCheck(a);
   for (int i = 0; i <a; i++) {
    for (int j = a; j >i; j--) {
     System.out.print('*');
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

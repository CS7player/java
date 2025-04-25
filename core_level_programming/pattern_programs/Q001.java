package core_level_programming.pattern_programs;
import core_level_programming.number_programming.CommomCheck;
import java.util.Scanner;
public class Q001 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number : ");
  try {
   int a = sc.nextInt();
   CommomCheck.isLimitCheck(a);
  for(int i=0;i<a;i++){
   for(int j=0;j<a;j++){
    System.out.print('*');
   }
   System.out.println();
  }
  } catch (Exception e) {
   System.out.println(e.getMessage());
  } finally{
   sc.close();
  }
 }
}

package core_level_programming.pattern_programs;
import core_level_programming.number_programming.CommomCheck;
import java.util.Scanner;
public class Q003 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("enter the num : ");
   int a = sc.nextInt();
   CommomCheck.IsNegativeCheck(a);
   for(int i=0;i<a;i++){
    for(int j=0;j<a;j++){
     if(i==j || i+j==a-1){
      System.out.print('*');
     }else{
      System.out.print(' ');
     }
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

package core_level_programs.array_programs;
import java.util.Arrays;
import java.util.Scanner;

import core_level_programs.reusable_code.CommonCheck;
public class Q004 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the length : ");
   int arrLength = sc.nextInt();
   CommonCheck.isLimitCheck(arrLength, 0);
   int[] arr = new int[arrLength];
   for(int i=0;i<arrLength;i++){
    System.out.print("Enter the num"+(i+1)+" : ");
    arr[i] = sc.nextInt();
   }
   System.out.println(Arrays.toString(arr));
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

package medium_level_programs.array_programs;

import java.util.Scanner;

import core_level_programs.reusable_code.CommonCheck;

public class Q001 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the number");
   int num = sc.nextInt();
   System.out.println("___________________________");
   for(int i=1;i<11;i++){
    System.out.println("|"+num+" x "+i+" = "+ (num*i)+" |");
   }
   System.out.println("___________________________");
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

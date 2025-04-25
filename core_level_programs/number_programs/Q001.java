package core_level_programs.number_programs;

import java.util.Scanner;
import core_level_programs.reusable_code.CommonCheck;

public class Q001 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("enter the num : ");
   int a = sc.nextInt();
   CommonCheck.isLimitCheck(a, 0);
   System.out.println(a);
  } catch (Exception e) {
   System.out.println(e.getMessage());
  } finally {
   sc.close();
  }
 }
}
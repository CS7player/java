package medium_level_programs.number_programs;

import java.util.Scanner;
import medium_level_programs.reusable_code.CommonCheck;

public class Q002 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the number : ");
   int num = sc.nextInt();
   CommonCheck.isNegative(num);
   int factor = 0;
   for (int i = 1; i <= num; i++) {
    if (num % i == 0) {
     factor++;
    }
   }
   String result = factor == 2 ? "Prime Number" : "Not a Prime Number";
   System.out.println(result);
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

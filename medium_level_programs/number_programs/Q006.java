package medium_level_programs.number_programs;

import java.util.ArrayList;
import java.util.Scanner;
import medium_level_programs.reusable_code.CommonCheck;

public class Q006 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the number : ");
   int num = sc.nextInt();
   CommonCheck.isNegative(num);
   ArrayList<Integer> arrList = new ArrayList<>();
   int product = 1;
   int sum = 0;
   for (int i = 1; i <= num; i++) {
    if (num % i == 0) {
     arrList.add(i);
     product *= i;
     sum += i;
    }
   }
   System.out.println(arrList);
   System.out.println("Sum : " + sum);
   System.out.println("product : " + product);
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

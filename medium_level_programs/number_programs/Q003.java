package medium_level_programs.number_programs;

import java.util.ArrayList;
import java.util.Scanner;
import medium_level_programs.reusable_code.CommonCheck;

public class Q003 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the lower limit : ");
   int lowerLimit = sc.nextInt();
   CommonCheck.isNegative(lowerLimit);
   System.out.print("Enter the upper limit : ");
   int upperLimit = sc.nextInt();
   CommonCheck.isNegative(upperLimit);
   CommonCheck.isLimitCheck(lowerLimit, upperLimit);
   ArrayList<Integer> arrlist = new ArrayList<>();
   for (int i = lowerLimit; i <= upperLimit; i++) {
    int factor = 0;
    for (int j = 1; j <= i; j++) {
     if (i % j == 0) {
      factor++;
     }
    }
    if (factor == 2) {
     arrlist.add(i);
    }
   }
   System.out.println(arrlist);
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

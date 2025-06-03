package medium_level_programs.number_programs;

import java.util.Scanner;

import medium_level_programs.reusable_code.CommonCheck;

public class Q008 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("enter the number : ");
   int num = sc.nextInt();
   CommonCheck.isNegative(num);
   int nextPrime = num;
   int factor = 0;
   while (true) {
    factor = 0;
    nextPrime++;
    for (int i = 1; i <= nextPrime; i++) {
     if (nextPrime % i == 0) {
      factor++;
     }
    }
    if(factor==2){
     break;
    }
   }
   System.out.println(nextPrime);
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

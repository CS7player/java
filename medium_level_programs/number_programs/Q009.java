package medium_level_programs.number_programs;

import java.util.ArrayList;
import java.util.Scanner;

import medium_level_programs.reusable_code.CommonCheck;

public class Q009 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("enter the number : ");
   int num = sc.nextInt();
   CommonCheck.isNegative(num);
   ArrayList<Long> arrList = new ArrayList<>();
   arrList.add((long)0);
   arrList.add((long)1);
   int count = 2;
   while (count < num) {
    int length = arrList.size();
    Long a = arrList.get(length-1);
    Long b = arrList.get(length-2);
    Long c = a+b;
    arrList.add(c);
    count++;
   }
   System.out.println(arrList.get(count-1));
  } catch (Exception e) {
   System.out.println(e.getMessage());
  } finally {
   sc.close();
  }
 }
}

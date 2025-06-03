package medium_level_programs.number_programs;

import java.util.ArrayList;
import java.util.Scanner;

import medium_level_programs.reusable_code.CommonCheck;

public class Q010 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("enter the number : ");
   int num = sc.nextInt();
   CommonCheck.isNegative(num);
   ArrayList<Long> arrList = new ArrayList<>();
   arrList.add((long) 0);
   arrList.add((long) 1);
   while (true) {
    int length = arrList.size();
    Long a = arrList.get(length - 1);
    Long b = arrList.get(length - 2);
    Long c = a + b;
    arrList.add(c);
    if (num <= c) {
     break;
    }
   }
   String result = num == arrList.get(arrList.size() - 1) ? "yes" : "no";
   System.out.println(result);
  } catch (Exception e) {
   System.out.println(e.getMessage());
  } finally {
   sc.close();
  }
 }
}

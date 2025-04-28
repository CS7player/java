package core_level_programs.array_programs;

import java.util.Scanner;
import java.util.Arrays;
import core_level_programs.reusable_code.CommonCheck;
import core_level_programs.reusable_code.CommonUtils;

public class Q008 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the arr1 length : ");
   int arr1Length = sc.nextInt();
   CommonCheck.isLimitCheck(arr1Length, 0);
   int[] arr1 = new int[arr1Length];
   for (int i = 0; i < arr1Length; i++) {
    System.out.print("Enter the arr1 num" + (i + 1) + " : ");
    arr1[i] = sc.nextInt();
   }
   System.out.print("Enter the arr2 length : ");
   int arr2Length = sc.nextInt();
   CommonCheck.isLimitCheck(arr2Length, 0);
   int[] arr2 = new int[arr2Length];
   for (int i = 0; i < arr2Length; i++) {
    System.out.print("Enter the arr2 num" + (i + 1) + " : ");
    arr2[i] = sc.nextInt();
   }
   int[] mergeArr = CommonUtils.mergeArrays(arr1, arr2);
   System.out.println(Arrays.toString(mergeArr));
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

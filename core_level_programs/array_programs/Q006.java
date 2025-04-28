package core_level_programs.array_programs;

import java.util.Scanner;
import java.util.HashMap;
import core_level_programs.reusable_code.CommonCheck;

public class Q006 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the length : ");
   int arrLength = sc.nextInt();
   CommonCheck.isLimitCheck(arrLength, 0);
   int[] arr = new int[arrLength];
   HashMap<Integer, Integer> obj = new HashMap<>();
   for (int i = 0; i < arrLength; i++) {
    System.out.print("Enter the num" + (i + 1) + " : ");
    arr[i] = sc.nextInt();
    if(obj.containsKey(arr[i])){
     int value = obj.get(arr[i]);
     obj.put(arr[i], ++value);
    }else{
     obj.put(arr[i], 1);
    }
   }
   for(Integer key : obj.keySet()){
    if(obj.get(key)>1){
     System.out.println(key+" "+obj.get(key));
    }
   }
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

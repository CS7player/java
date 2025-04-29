package core_level_programs.string_programs;

import java.util.HashMap;
import java.util.Scanner;
import core_level_programs.reusable_code.CommonCheck;

public class Q004 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the word : ");
   String word = sc.next();
   char[] arrChar = word.toCharArray();
   HashMap<Character, Integer> obj = new HashMap<>();
   for (char character : arrChar) {
    if (obj.containsKey(character)) {
     int val = obj.get(character);
     obj.replace(character, ++val);
    } else {
     obj.put(character, 1);
    }
   }
   System.out.println(obj);
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

package core_level_programs.string_programs;

import java.util.HashMap;
import java.util.Scanner;
import core_level_programs.reusable_code.CommonCheck;

public class Q002 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the word : ");
   String word = sc.next();
   char[] arrChar = word.toCharArray();
   HashMap<String, Integer> obj = new HashMap<>();
   obj.put("character", 0);
   obj.put("numbers", 0);
   obj.put("alphabets", 0);
   for (char character : arrChar) {
    int asciiValue = (int) character;
    if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
     int val = obj.get("alphabets");
     obj.replace("alphabets", ++val);
    } else if (asciiValue >= 48 && asciiValue <= 57) {
     int val = obj.get("numbers");
     obj.replace("numbers", ++val);
    } else {
     int val = obj.get("character");
     obj.replace("character", ++val);
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

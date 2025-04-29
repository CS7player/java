package core_level_programs.string_programs;
import java.util.Scanner;
import core_level_programs.reusable_code.CommonCheck;

public class Q003 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the word : ");
   String word = sc.next();
   StringBuilder sb = new StringBuilder(word);
   String reversed = sb.reverse().toString();
   System.out.println(reversed);
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

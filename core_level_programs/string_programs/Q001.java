package core_level_programs.string_programs;
import java.util.Arrays;
import java.util.Scanner;
import core_level_programs.reusable_code.CommonCheck;

public class Q001 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the word : ");
   String word = sc.next();
   String[] arr = word.split("");
   System.out.println(Arrays.toString(arr));
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally {
   sc.close();
  }
 }
}

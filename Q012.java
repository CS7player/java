package core_level_programming.number_programming;
import java.util.Scanner;
import java.util.Arrays;
//WAPTP factors of a number
public class Q012 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the number : ");
   int a = sc.nextInt();
   CommomCheck.IsNegativeCheck(a);
   CommomCheck.isLimitCheck(a);
   int[] arr = new int[a];
   arr[0] = 0;
   arr[1] = 1;
   for(int i=2;i<a;i++){
    arr[i] = arr[i-1] + arr[i-2];
   }
   System.out.println(Arrays.toString(arr));
  } catch (Exception e) {
   System.out.println(e.getMessage());
  } finally {
   sc.close();
  }
 }
}

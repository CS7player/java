import java.util.Scanner;
//WAPTP sum of the numbers between m to n
public class Q002 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter the num1 : ");
   int a = sc.nextInt();
   System.out.print("Enter the num2 : ");
   int b = sc.nextInt();
   orderCheck(a, b);
   int sum = 0;
   for(int i = a;i<b;i++){
    sum = sum + i;
   }
   System.out.println("sum is "+sum);
  } catch(WrongOrderException e){
   System.out.println("Invalid order!!!");
  }
  catch (Exception e) {
   System.out.println("Invalid Number!!!");
  } finally{
   sc.close();
  }
 }

 public static void orderCheck(int a,int b) throws  WrongOrderException{
  if(a>b){
   throw new WrongOrderException();
  }
 }

 static class WrongOrderException extends RuntimeException{}

}

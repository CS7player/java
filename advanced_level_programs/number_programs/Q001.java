package advanced_level_programs.number_programs;
import java.util.Scanner;
public class Q001 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number : ");
  int num = sc.nextInt();
  boolean isPrime = isPrime(num);
  if(!isPrime){
   System.out.println("Number is not prime numbers.. ");
   return ;
  }
  int twistedNumber = twister(num);
  boolean isTwistedNumberPrime = isPrime(twistedNumber);
  if(!isTwistedNumberPrime){
   System.out.println("Number is not Twisted prime numbers.. ");
   return ;
  }else{
   System.out.println("Number is Twisted prime numbers.. ");
  }
 }

 public static boolean isPrime(int num){
  int count = 0;
  for(int i=1;i<=num;i++){
   if(num%i==0){
    count++;
   }
  }
  if(count == 2){
   return true;
  }
  return false;
 }

 public static int twister(int num){
  int twistedNumber = 0;
  while(num!=0){
   int lastDigit = num % 10;
   twistedNumber = twistedNumber * 10 + lastDigit;
   num /= 10;
  }
  return twistedNumber;
 }
}

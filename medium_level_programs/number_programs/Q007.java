package medium_level_programs.number_programs;

import java.util.Scanner;

import medium_level_programs.reusable_code.CommonCheck;

public class Q007 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("enter the number : ");
   int num = sc.nextInt();
   CommonCheck.isNegative(num);
   int count = 1;
   int prime = 1;
   while(count <= num){
    int factor = 0;
    for(int i=1;i<=prime;i++){
     if(prime%i==0){
      factor++;
     }
    }
    if(factor == 2){
     count++;
    }
    prime++;
   }
   System.out.println(prime);
  } catch (Exception e) {
   CommonCheck.errorHandler(e);
  } finally{
   sc.close();
  }
 }

}

package medium_level_programs.reusable_code;

public class MyException extends Exception {

 //Negative Number
 public static class NegativeNumberException extends Exception {
  public NegativeNumberException() {
   super("Given number is Negative!!!");
  }
 }

 //Invalid Limit values
 public static class InvalidLimitException extends Exception {
  public InvalidLimitException(){
   super("Invalid Limit Values!!!");
  }
 }
}

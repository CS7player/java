package core_level_programs.reusable_code;

public class MyException extends Exception{
 public static class LimitException extends Exception{
  public LimitException(){
   super("Limit Exceeded!!!");
  }
 }
}

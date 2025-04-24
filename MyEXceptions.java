public class MyEXceptions extends Exception {
 static class WrongOrderException extends Exception {
  public WrongOrderException() {
   super("Wrong order of numbers!!!");
  }
 }

 static class NegativeNumberException extends Exception {
  public NegativeNumberException() {
   super("Negative number is Invalid!!!");
  }
 }
 
 static class LimitException extends Exception {
  public LimitException(){
   super("Limit Invalid!!!");
  }
 }
}

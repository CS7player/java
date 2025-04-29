package medium_level_programs.reusable_code;

public class CommonCheck {

 // negative number
 public static void isNegative(int number) throws MyException.NegativeNumberException {
  if (number < 0) {
   throw new MyException.NegativeNumberException();
  }
 }

 // limit check
 public static void isLimitCheck(int lowerLimit, int upperLimit) throws MyException.InvalidLimitException {
  if (upperLimit <= lowerLimit) {
   throw new MyException.InvalidLimitException();
  }
 }

 // Error Handler;
 public static void errorHandler(Exception e) {
  if (e.getMessage() == null) {
   System.out.println("Invalid Number input!!!");
   return;
  }
  System.out.println(e.getMessage());
 }
}

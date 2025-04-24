public class CommomCheck {
 public static void orderCheck(int a, int b) throws MyEXceptions.WrongOrderException {
  if (a > b) {
   throw new MyEXceptions.WrongOrderException();
  }
 }

 public static void IsNegativeCheck(int a) throws MyEXceptions.NegativeNumberException {
  if (a < 0) {
   throw new MyEXceptions.NegativeNumberException();
  }
 }

 public static void isLimitCheck(int a) throws MyEXceptions.LimitException {
  if(a<2){
   throw new MyEXceptions.LimitException();
  }
 }
}

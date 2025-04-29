package core_level_programs.reusable_code;
//class in same package should not be imported !!
public class CommonCheck {
 public static void isLimitCheck(int a,int limit) throws MyException.LimitException{
  if(a < limit){
    throw new MyException.LimitException();
  }
 }

 //Error Handler;
 public static void errorHandler(Exception e){
  if(e.getMessage() == null){
   System.out.println("Invalid Number input !!!");
   return;
  }
  System.out.println(e.getMessage());
 }
}  

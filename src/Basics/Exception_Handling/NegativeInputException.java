package Basics.Exception_Handling;

public class NegativeInputException
        extends Exception {
   public NegativeInputException(){
       this("Input must be >=0");
   }
    public  NegativeInputException(String message){
       super(message);
    }
}

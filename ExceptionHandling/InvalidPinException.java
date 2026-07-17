package ExceptionHandling;

public class InvalidPinException extends Exception{
    InvalidPinException(String msg){
        super(msg);
    }
}

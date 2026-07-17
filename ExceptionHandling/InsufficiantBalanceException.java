package ExceptionHandling;

public class InsufficiantBalanceException extends RuntimeException{
    InsufficiantBalanceException(String msg){
        super(msg);
    }
}

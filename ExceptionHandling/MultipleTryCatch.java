package ExceptionHandling;

public class MultipleTryCatch {
    static void main(String[] args) {
        try{

            try{

            } catch (Exception e) {

            }
            finally {
                System.out.println("Inner finally");
            }

        }catch (ArithmeticException e){

        }
        finally {
            System.out.println("Finally");
        }

    }
}

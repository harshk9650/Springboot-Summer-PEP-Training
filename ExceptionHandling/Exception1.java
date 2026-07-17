package ExceptionHandling;

public class Exception1 {

    static void main(String[] args) {

        try {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("The number hould not be divide by zero" +
                    " jebe");
        }


    }
}

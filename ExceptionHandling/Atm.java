package ExceptionHandling;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int AtmPin = 4567;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin: ");
        int pin = sc.nextInt();


        try{
            if(pin!=AtmPin){
                throw new InvalidPinException("PIn is incorrect ");

            }else {
                System.out.println("welcome to ATM");
            }
        } catch (InvalidPinException e) {
            e.printStackTrace();
        }

    }
}

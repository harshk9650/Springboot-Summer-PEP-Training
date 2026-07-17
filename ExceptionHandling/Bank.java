package ExceptionHandling;

import java.util.Scanner;

public class Bank {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current balance: ");
        int currentBal = sc.nextInt();
        System.out.print("Enter your Withdraw amount: ");
        int withdraw = sc.nextInt();

        try{
            if(withdraw>currentBal){
                throw new InsufficiantBalanceException("Insufficient balance");
            }else {
                System.out.println(withdraw+" withdraw succefull");
            }
        } catch (InsufficiantBalanceException e) {
           e.printStackTrace();
        }


    }
}

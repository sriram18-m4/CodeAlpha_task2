import java.io.*;
import java.lang.*;
import java.util.*;

public class onlinequizplatform{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double balance = 0.0; 
        boolean cancel = false;

        while (!cancel) {
            System.out.println("1: View Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: cancel");
            System.out.println("Select one option from above[1-4]:");

            
            String userinp = s.nextLine();

            switch (userinp) {
                case "1":
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;

                case "2":
                    System.out.print("Enter the amount to deposit: $");
                    double Depositamt = s.nextDouble();
                    scanner.nextLine();
                    if (Depositamt > 0) {
                        balance += Depositamt;
                        System.out.printf("$%.2f deposit successfull.%n", depositAmount);
                    } else {
                        System.out.println("Invalid amount, Please try again");
                    }
                    break;

                case "3":
                    System.out.print("Enter the amount to withdraw: $");
                    double Withdrawamt = s.nextDouble();
                    scanner.nextLine();
                    if (Withdrawamt > 0 && Withdrawamt <= balance) {
                        balance -= Withdrawamt;
                        System.out.printf("$%.2f withdraw successfull.%n", Withdrawamt);
                    } else if(Withdrawamt> balance) {
                        System.out.println("Insufficient balance.");
                    } 
                    break;

                case "4":
                    System.out.println("You cancelled the process");
                    cancel = true;
                    break;

                default:
                    System.out.println("Invalid option,please try again and choose a option :[1-4]");
            }
        }
        
        s.close();
    }
}
               

   
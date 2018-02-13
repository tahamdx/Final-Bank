package theapplication;

/**
 *
 * @author Mohammed
 */

import java.util.Scanner;
public class TheApplication {
    public static void main(String args[]){
    
    Scanner input = new Scanner (System.in);
    
    
            System.out.println("Welcome to MDX Bank. Select an option: \n");
            System.out.println("1.) Create Bank Account \n");
            System.out.println("2.) Create User \n");
            System.out.println("3.) Run Simulation \n");
            System.out.println("4.) Exit \n");
            
            System.out.println("Enter your desired option: ");
            int option = input.nextInt();
            
        while (option != 4){
            if (option  < 1 || option > 3) {

            System.out.println("Enter your desired option: ");
            option = input.nextInt();
        }
            else if(option == 1)
            {
                 System.out.println("You have selected Create Bank Account.");
                 long accountNo = 9876543210l;
                 
                 
                 System.out.println("You have been assigned bank account number " + accountNo + "\n");
                 System.out.println("what ammount would you like to deposit?\n");
                 
                 int accountBalance = input.nextInt();
                 
                 MDXBank ac1 = new MDXBank(accountNo, accountBalance);
                 System.out.println("..... \n");
                 System.out.println("You have successfully created a bank account");
                 
                 System.out.println("Your bank account number is " + accountNo+ " and you have a balance of " + accountBalance + "£");
            }
            else if(option == 2)
            {
                 System.out.println("You have selected Create User.");
            }
            else if(option == 3)
            {
                 System.out.println("You have selected Run Simulation.");
            }
            else if(option == 4)
            {
                 
            }
    }
    }
}
   
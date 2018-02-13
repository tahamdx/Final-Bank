package theapplication;

/**
 *
 * @author Mohammed
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TheApplication {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        MDXBank bank_acc = new MDXBank(9876543210L, 1980.0);
        ArrayList<User> userTrans = new ArrayList<>();

        double[] user1Transactions = {50, 10, -20, 10, -20, 20, 10, 50, -10, 10, -10, 50};
        double[] user2Transactions = {20, 20, -20, 50, -20, 10, 50, 50, -20, 10, 10};
        double[] user3Transactions = {50, 10, 10, -10, -10, 50, 20, -10, -20};
        double[] user4Transactions = {50, 10, -20, 20, 10, -20};

        userTrans.add(new User("Saul", "Goodman", bank_acc, user1Transactions));
        userTrans.add(new User("Walter", "White", bank_acc, user2Transactions));
        userTrans.add(new User("Jessie", "Pinkman", bank_acc, user3Transactions));
        userTrans.add(new User("Hank", "Schrader", bank_acc, user4Transactions));

        System.out.println("Welcome to MDX Bank. Select an option: \n");
        System.out.println("1.) Create Bank Account \n");
        System.out.println("2.) Create User \n");
        System.out.println("3.) Run Simulation \n");
        System.out.println("4.) Exit \n");

        System.out.println("Enter your desired option: ");
        int option = input.nextInt();

        while (true) {
            {

                System.out.println("Enter your desired option: ");
                option = input.nextInt();
            }
            if (option == 1) {
                System.out.println("You have selected Create Bank Account.");
                long accountNo = 9876543210l;
                int accountBalance = 1980;

                MDXBank ac1 = new MDXBank(accountNo, accountBalance);
                System.out.println("..... \n");
                System.out.println("You have successfully created a bank account");

                System.out.println("Your bank account number is " + accountNo + " and you have a balance of " + accountBalance + "£");
            }

            if (option == 2) {
                System.out.println("You have selected Create User\n");
                System.out.println("User Saul Goodman created\n");
                System.out.println("User Walter White created\n");
                System.out.println("User Jessie Pinkman created\n");
                System.out.println("User Hank Schrader created\n");

            }
            if (option == 3) {
                System.out.println("You have selected Run Simulation.");
                for (int i = 0; i < 4; i++) {
                    userTrans.get(i).start();
                }
            }
            if (option == 4) {
                System.exit(0);
            }
        }
    }
}

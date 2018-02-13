package theapplication;

/**
 *
 * @author Mohammed
 */
public class MDXBank {
    private long accountNo;
    private double accountBalance;
    
    public MDXBank(long accountNo, double accountBalance)
        {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        }
    
    public long getAccountNo()
        {
        return this.accountNo;
        }

    public double getAccountBalance()
        {
        return this.accountBalance;
        }
    
    public void deposit(double value, User u)
        {
         System.out.println("The user " + u.name + " deposits an amount " + value);
         accountBalance = accountBalance + value;
        }
    
    public void withdraw(double value, User u)
        {
         System.out.println("The user " + u.name + " withdraws an amount " + value);
         accountBalance = accountBalance - value;
        }
}
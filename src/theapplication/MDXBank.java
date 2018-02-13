package theapplication;

/**
 *
 * @author Mohammed
 */
public class MDXBank  {
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
    
    public synchronized void deposit(double value, String name)
        {
         System.out.println("The user " + name + " deposits an amount " + value);
         accountBalance = accountBalance + value;
        }
    
    public synchronized void withdraw(double value, String name)
        {
         System.out.println("The user " + name + " withdraws an amount " + value*(-1));
         accountBalance = accountBalance - value;
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theapplication;

/**
 *
 * @author Mohammed
 */
public class User extends Thread{
    public String name;
    public String surname;
    public MDXBank bankAccount;
    
    public double[] transactionList;
    
    public User(String n, String s, MDXBank bA, double[] tL)
    {
    this.name = n;
    this.surname = s;
    this.bankAccount = bA;
    this.transactionList = tL;

    }
    @Override 
    public void run(){
        for (int i=0;i<transactionList.length;i++){
            if(transactionList[i]<=0){
                bankAccount.withdraw(transactionList[i],this.name);
            }
            if(transactionList[i]>0){
                bankAccount.deposit(transactionList[i], this.name);
            }
        }
    }
}


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
public class User {
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
}

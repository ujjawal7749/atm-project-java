/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author ujjaw
 */
public class Customer {
    public String cnic,name,acno,cardno,pin;
    int bal;

    public Customer(String cnic, String name, String acno, String bal, String cardno, String pin) {
        this.cnic = cnic;
        this.name = name;
        this.acno = acno;
        this.bal = Integer.parseInt(bal);
        this.cardno = cardno;
        this.pin = pin;
    }
    
    public Customer()
    {}
    
    public boolean withdraw(int amount)
    {
       if(bal>=amount)
       {
           this.bal-=amount;
           return true;
       }
       return false;
    }
    
    public void deposit(int amount)
    {
        bal+=amount;
    }
    
    @Override
    public String toString()
    {
        return (cnic+","+name+","+acno+","+bal+","+cardno+","+pin);
    }
}

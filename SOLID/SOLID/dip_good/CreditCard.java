package dip_good;

public class CreditCard implements BankCard{
    public void doTransaction(long amount){     
        System.out.println("tx done with CreditCard");      
        }
    }
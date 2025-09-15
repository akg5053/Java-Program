package dip_good;

public class DebitCard implements BankCard{
    public void doTransaction(long amount){
    System.out.println("tx done with DebitCard");
        }
    }
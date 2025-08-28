import javax.naming.InsufficientResourcesException;

public class Bank {
    private int balance=10000;
    public void withdraw(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Not Enough Balance");

        }else{
            balance=amount;
            System.out.println("Withdrawl Successfull,Remaining Balance"+balance);
        }
    }
}
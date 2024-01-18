package exception;

public class BankingApp
{
    public void deposite(double amount) throws LessAmountException
    {
        if (amount>=5000){
            System.out.println("your account has been created with a valid deposite");
        }
        else
        {
            throw new LessAmountException("Process Failed as Amount is less than or equal to 5000");
        }
    }

    public static void main(String[] args) {
        BankingApp obj = new BankingApp();
        try {
            obj.deposite(4999.5);
        } catch (LessAmountException e) {
            System.out.println("exception occurred"+e);
        }
    }


}


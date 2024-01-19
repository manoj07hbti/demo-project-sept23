package exception;

public class AmountOpeningApp {
    public void amount(double amount)throws LessAmountException{
        if(amount>=5000){
            System.out.println("welcome to opening account in bank");
        }else { throw new LessAmountException("Account holder must have minimum or more balance to 5000 for opening account");

        }

    }

    public static void main(String[] args) {
        AmountOpeningApp obj=new AmountOpeningApp();
        try {
            obj.amount(4000);
        } catch (LessAmountException e) {
            System.out.println("exception appeared:"+e);
        }
    }
}

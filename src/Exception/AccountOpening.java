package Exception;

public class AccountOpening {

    public void account(double amount) throws LessAmountException {

        if (amount >= 5000) {
            throw new LessAmountException("Account opened successfully with an initial deposit of " + amount);
        } else {

            System.out.println("Opening Bank Account Failed Because amount is less than 5000");
        }
    }

    public static void main(String[] args) {
        AccountOpening obj = new AccountOpening();

        try {
            obj.account(8000.05);
        } catch (LessAmountException e) {
            System.out.println("Caught the Exception");

            System.out.println("Exception occurred: " + e);
        }
    }
}


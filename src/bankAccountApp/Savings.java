package bankAccountApp;

// we are using inheritance in childs class, so that what we write in the account class is true for the
// child classes that inherit it.

public class Savings extends Account{

    // list specific properties of the savings account
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    // constructor to initialize settings for savings properties
    public Savings(
        String name,
        String sSN,
        double initDeposit
    ){

        // para ter acesso ao name do pai => account
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate()-0.25;

        System.out.println("Implement rate for savings");
    }

    // list any methods specific to savings account
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)  (Math.random() * Math.pow(10, 3));
        getSafetyDepositBoxKey = (int)  (Math.random() * Math.pow(10, 4));

    }

    public void showInfo(){
        System.out.println("\nAccount type: savings\n"+
                "Safety deposity box key: "+ getSafetyDepositBoxKey+
                "\nSafety deposit box id: "+ safetyDepositBoxID
        );
        super.showInfo();

    }
}

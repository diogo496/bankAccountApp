package bankAccountApp;

// nao somos capazes de criar objetos da class Account
// mas podemos criar objetos de classes que herdem Account (inherit) => savings and checking

// account implements the iBaseRte. whatever is inside rate will be included in owr account.
// so the child classes will have properties that are both inside the account and interest rate
public abstract class Account implements IBaseRate{

    // list common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;
    // protected means its accessible in the same package and subclasses
    protected double rate;
    protected String accountNumber;
    private static int index = 10000;


    // constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
        setRate();

    }

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println(
                "Accrued interest: "
                + accruedInterest
        );
        printBalance();

    }

    // checking and savings have to implement this method
    public abstract void setRate();


    // list common methods in checking and saving account
    public void deposit(double amount){
        balance = balance + amount;
        printBalance();

    }

    public void withdraw (double amount){
        balance = balance - amount;
        printBalance();

    }

    public void transfer(String destiny, double amount){
        balance = balance - amount;
        System.out.println(" Transfering $"+amount+" to "+destiny);
        printBalance();
    }

    public void printBalance(){
        System.out.println("your balance is $"+balance);
    }

    public void showInfo(){
        System.out.println(
                "Name: " + name +
                "\nAccount number: " + accountNumber +
                "\nBalance: " + balance+
                "\nRate: " + rate + "%"
        );
    }
}

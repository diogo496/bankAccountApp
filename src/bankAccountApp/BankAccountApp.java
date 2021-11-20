package bankAccountApp;

public class BankAccountApp {
    public static void main(String[] args){

        Checking account1 = new Checking("Diogo salario", "321456879", 1500);
        Savings account2 = new Savings("Diogo poupadinho", "456657897", 2500);

        account1.showInfo();
        account2.showInfo();

        /*
        account1.deposit(5000);
        account1.withdraw(200);
        account1.transfer("to some other person",5000);
        */
        account1.compound();
        // read a csv file then create new accounts based on that data


    }
}

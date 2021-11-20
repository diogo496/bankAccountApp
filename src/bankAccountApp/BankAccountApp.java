package bankAccountApp;

public class BankAccountApp {
    public static void main(String[] args){

        Checking account1 = new Checking("Diogo salario", "321456879", 1500);
        Savings account2 = new Savings("Diogo poupadinho", "456657897", 2500);

        account1.showInfo();
        account2.showInfo();
        // read a csv file then create new accounts based on that data


    }
}

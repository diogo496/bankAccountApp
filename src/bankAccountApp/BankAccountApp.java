package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args){

        List<Account> accounts = new LinkedList<Account>();

        String filePath = "C:\\Users\\diogo\\OneDrive\\Documentos\\NewBankAccounts.csv";
        List<String[]> customersData = utilities.CSV.read(filePath);

        for( int i = 0; i<customersData.size(); i++){
            String[] customer = customersData.get(i);
            //System.out.println(Arrays.toString(customer));
            String name = customer[0];
            String sSN = customer[1];
            String accountType = customer[2];
            double initDeposit = Double.parseDouble(customer[3]);
            //System.out.println(name+" "+sSN+" "+accountType+" "+initDeposit);
            //System.out.println("customer"+i+": "+customersData.get(i));

            if( accountType.equals("Savings")){
                System.out.println("OPEN SAVINGS ACCOUNT");
                accounts.add(new Savings(name, sSN, initDeposit ));

            }else if( accountType.equals("Checking")){
                System.out.println("OPEN CHECKING ACCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit ));

            }else{
                System.out.println("error reading account type");
            }
        }

        for (Account acc:accounts
             ) {
            System.out.println("\n");
            acc.showInfo();
        }
        /*
        Checking account1 = new Checking("Diogo salario", "321456879", 1500);
        Savings account2 = new Savings("Diogo poupadinho", "456657897", 2500);

        account1.showInfo();
        account2.showInfo();
        */
        /*
        account1.deposit(5000);
        account1.withdraw(200);
        account1.transfer("to some other person",5000);
        */
        //account1.compound();
        // read a csv file then create new accounts based on that data


    }
}

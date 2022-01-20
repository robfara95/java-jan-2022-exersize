public class TestBankAccount {
  public static void main(String[] args) {
    BankAccount bank1 = new BankAccount();
    System.out.println("----Bank no arg---");
    System.out.println(bank1);

    System.out.println("---testing witdrawl 900 Checking without funds");
    bank1.withdrawMoney("Checking", 900);
    System.out.println(bank1);

    System.out.println("---testing witdrawl 900 savings without funds");
    bank1.withdrawMoney("Savings", 900);
    System.out.println(bank1);

    System.out.println("---testing deposit 444.99 savings account funds");
    bank1.depositMoney("Savings", 444.99);
    System.out.println(bank1);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());

    System.out.println("---testing deposit 200 savings account funds");
    bank1.depositMoney("Savings", 200);
    System.out.println(bank1);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());

    System.out.println("---testing witdraw 100 savings account funds");
    bank1.withdrawMoney("Savings", 100);
    System.out.println(bank1);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());

    System.out.println("---testing deposit 444.99 chk account funds");
    bank1.depositMoney("Checking", 444.99);
    System.out.println(bank1);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());

    System.out.println("---testing deposit 200 chk account funds");
    bank1.depositMoney("Checking", 200);
    System.out.println(bank1);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());

    System.out.println("---testing witdraw 100 chk account funds");
    bank1.withdrawMoney("Checking", 100);
    System.out.println(bank1);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());   

    // System.out.println("---testing witdraw 544.99 chk account funds");
    // bank1.withdrawMoney("Checking", 545);
    // System.out.println(bank1);
    // System.out.printf("Bal all acct: $%,.2f\n", BankAccount./getTotalMoneyAllAccts());
    
    System.out.println("----------2nd account------------------s");
    System.out.println("----------2nd account------------------s");
    System.out.println("creating 2nd account 7 ck 20 svg");
    BankAccount bank2 = new BankAccount(7, 20);
    System.out.println(bank2);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts()); 

    System.out.println("---2nd acct testing dep 55.66 savings acc funds");
    bank2.depositMoney("Savings", 55.66);
    System.out.println(bank2);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());

    System.out.println("---2nd acct testing dep 6.66 chk acc funds");
    bank2.depositMoney("Checking", 6.66);
    System.out.println(bank2);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());

    System.out.println("---2nd acct testing withdraw 2.00 savings acc funds");
    bank2.withdrawMoney("Checking", 2.00);
    System.out.println(bank2);
    System.out.printf("Bal all acct: $%,.2f\n", BankAccount.getTotalMoneyAllAccts());

  }
  
}
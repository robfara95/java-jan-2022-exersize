import java.util.Random;

public class BankAccount {
  private double checkingBalance;
  private double savingBalance;
  private long accountNumber;

  private static int nbrOfAccounts;
  private static double totalMoneyAllAccts = 0;

  public BankAccount(){
    this(0,0);
  }

  public BankAccount (double checkingBalance, double savingsBalance) {
    this.checkingBalance = checkingBalance;
    this.savingBalance = savingsBalance;
    totalMoneyAllAccts += this.checkingBalance + this.savingBalance;
    BankAccount.nbrOfAccounts++;
    accountNumber = getLongRandomNumber();
  }

  public double getCheckingBalance() {
    return this.checkingBalance;
  }

  public double getSavingsBalance() {
    return this.savingBalance;
  }

  public void depositMoney (String type, double amount) {
    if (type.equalsIgnoreCase("Checking")) {
      this.checkingBalance += amount;
      BankAccount.totalMoneyAllAccts += amount;
    } else if (type.equalsIgnoreCase("Savings")) {
      this.savingBalance += amount;
      BankAccount.totalMoneyAllAccts += amount;
    } else {
      System.out.printf("%s is invalid bank accounty type; No deposit", type);
    }

  }

  public void withdrawMoney (String type, double amount) {
    if (type.equalsIgnoreCase("Checking")) {
      if (amount <= this.checkingBalance) {
        this.checkingBalance -= amount;
        totalMoneyAllAccts -= amount;
      } else{
        System.out.println("Not enough funds in check account to complete withdrawl");
      }
    }
    else if (type.equalsIgnoreCase("Savings")) {
      if (amount <= this.savingBalance) {
        this.savingBalance -= amount;
        totalMoneyAllAccts -= amount;
      } 
      else{
        System.out.println("Not enough funds in saving account to complete withdrawl");
      }       
    } else {
        System.out.printf("%s is invalid bank accounty type; No withdrawl", type);
    }
  }

  public double totalBalance() {
    return this.checkingBalance + this.savingBalance;
  }

  public static double getNbrOfAccounts () {
    return nbrOfAccounts;
  }

  public static double getTotalMoneyAllAccts () {
    return BankAccount.totalMoneyAllAccts;
  }

  public String toString() {
    return String.format("Account nbr: %d saving balance:$%,.2f checking balance:$%,.2f bank balance:$%,.2f Nbr of acc: %d", accountNumber,savingBalance,checkingBalance,totalBalance(), BankAccount.nbrOfAccounts);
  }

  public long getLongRandomNumber () {
    long leftLimit = 1000000000L;
    long rightLimit = 9999999999L;
    return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
  }
}
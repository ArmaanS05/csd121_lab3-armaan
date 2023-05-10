package programming_project_3_13;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{
   private int freeTransaction;
   private double fee;
   private double balance;


   public BankAccount()
   {
      balance = 0;
   }


   public BankAccount(double initBal, double fee, int freeTransaction)
   {
      balance = initBal;
      this.fee = fee;
      this.freeTransaction = freeTransaction;
   }


   public void deposit(double amount)
   {
      balance = balance + amount;
      for (int i = 0; i < (freeTransaction <= 0 ? 1 : 0); i++) {
         balance -= fee;
      }
      freeTransaction--;
   }


   public void withdraw(double amount)
   {
      balance = balance - amount;
      for (int i = 0; i < (freeTransaction <= 0 ? 1 : 0); i++) {
         balance -= fee;
      }
      freeTransaction--;
   }


   public double getBalance()
   {
      return balance;
   }
}


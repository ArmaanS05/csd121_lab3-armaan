package practice_excercise_3_9;

public class SavingsAccount {
    private double initBal;
    private double interestRate;
    private double bal;

    public SavingsAccount(double initBal, double interestRate) {
        this.bal = initBal;
        this.interestRate = interestRate;
    }

    public double balCheck() {
        return this.bal;
    }

    public void getInterest() {
        for(int i = 1; i < 5; ++i) {
            System.out.println("" + i + " years of interest.");
            double interest = this.bal * this.interestRate / 100.0;
            this.bal += interest;
            System.out.println(this.bal);
        }

    }
}

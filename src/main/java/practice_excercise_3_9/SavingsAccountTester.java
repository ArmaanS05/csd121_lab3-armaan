package practice_excercise_3_9;

public class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(2000.0, 10.0);
        System.out.println("Expected each year: ~$200-300 in interest");
        account.getInterest();
        account.balCheck();
    }
}

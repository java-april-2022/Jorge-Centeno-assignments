public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount jorgeAccount = new BankAccount();
        jorgeAccount.depositMoney(800, "checking");
        jorgeAccount.depositMoney(150, "savings");
        jorgeAccount.withdrawMoney(801, "checking");
        jorgeAccount.withdrawMoney(1000, "savings");


        BankAccount lillyAccount = new BankAccount();
        lillyAccount.depositMoney(1100, "checking");
        lillyAccount.depositMoney(1400, "savings");
        lillyAccount.withdrawMoney(1000, "checking");
        lillyAccount.withdrawMoney(400, "savings");


        System.out.println(jorgeAccount.getCheckingBalance());
        System.out.println(jorgeAccount.getSavingsBalance());

        System.out.println(lillyAccount.getCheckingBalance());
        System.out.println(lillyAccount.getSavingsBalance());

        System.out.println(BankAccount.totalAccountBalance); 
    }
}

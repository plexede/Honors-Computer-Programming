public class BankUI {
    BankAccount acctInterface = new BankAccount("HOLDER_NAME", 0, 0000);

    public String acctSummarizedString() {
        return ("Account Holder: " + acctInterface.acctName + "Balance: " + acctInterface.acctBalance);
    }

    int mainMenu() {
        System.out.println(acctSummarizedString());
        System.out.println("Welcome. do sum iono\n" +
                "1. Deposit" +
                "2. Withdraw" +
                "3. Check Balance");
        switch (userInput) {
            case 1:
                // deposit
                break;
            case 2:
                // withdraw
                break;
            case 3:

            default:
                break;
        }
    }

    void depositMenu() {
        String userInput();
        // how much?
        acctInterface.deposit(userInput);
    }
}

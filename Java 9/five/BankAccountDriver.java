public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount acctInterface = new BankAccount("HOLDER_NAME", 0, 0000);
        BankUI ui = new BankUI();
        // for (boolean valid = false; !valid;) {
            int userChoice = ui.mainMenu();
            // valid = (userChoice > 0) && (userChoice <= NUMBER_OF_OPTIONS);
            // if (!valid)
            // System.out.println("Invalid input!");
            switch (userChoice) {
                case 1:
                    // deposit
                    acctInterface.deposit(ui.depositMenu());

                    break;
                case 2:
                    // withdraw
                    acctInterface.withdraw(ui.withdrawMenu());
                    break;
                case 3:
                    // check balance
                    System.out.println(ui.acctSummarizedString(acctInterface.acctName, acctInterface.acctBalance));
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
        // }
    }
}
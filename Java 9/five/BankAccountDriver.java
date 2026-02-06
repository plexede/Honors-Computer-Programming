public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount acctInterface = new BankAccount("HOLDER_NAME", 0, 0000);
        BankUI ui = new BankUI();
        // for (boolean valid = false; !valid;) {
        int userChoice = ui.mainMenu();
        // valid = (userChoice > 0) && (userChoice <= NUMBER_OF_OPTIONS);
        // if (!valid)
        // System.out.println("Invalid input!");
        for (boolean valid = true; !valid;) {
            switch (userChoice) {
                case 1:
                    // deposit
                    acctInterface.deposit(ui.depositMenu());
                    break;
                case 2:
                    // withdraw
                    double output = acctInterface.withdraw(ui.withdrawMenu(acctInterface.checkHold()));
                    if (output != -1) {
                        System.out.println("$" + output + " withdrawn.");
                    } else {
                        acctInterface.setHold();
                    }
                    break;
                case 3:
                    // check balance
                    System.out.println(ui.acctSummarizedString(acctInterface.acctName, acctInterface.acctBalance));
                    break;
                case 4:
                    // quit
                    System.out.println("bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    valid = false;
                    break;
            }
        }
        // }
    }
}
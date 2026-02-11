public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount acctInterface = new BankAccount("HOLDER_NAME", 0, 0000);
        BankUI ui = new BankUI();
        // for (boolean valid = false; !valid;) {
        while (true) {
            acctInterface.verify(ui.loginMenu(acctInterface.getAttempts(), acctInterface.checkHold()));
            while (acctInterface.verify()) {
                int userChoice = ui.mainMenu();
                // valid = (userChoice > 0) && (userChoice <= NUMBER_OF_OPTIONS);
                // if (!valid)
                // System.out.println("Invalid input!");
                boolean valid = true; // legacy
                // for (boolean valid = true; valid;) {
                switch (userChoice) {
                    case 1:
                        // deposit
                        acctInterface.deposit(ui.depositMenu());
                        break;
                    case 2:
                        // withdraw
                        double requestedQuantity = acctInterface.withdraw(ui.withdrawMenu(acctInterface.checkHold()));

                        if (requestedQuantity > acctInterface.getBalance()) {
                            acctInterface.setHold();
                            ui.presentError();
                        } else {
                            ui.presentWithdrawn(requestedQuantity);
                        }
                        break;
                    case 3:
                        // check balance
                        System.out.println(ui.acctSummarizedString(acctInterface.acctName, acctInterface.getBalance()));
                        break;
                    case 4:
                        // logout
                        ui.logout();
                        acctInterface.logout();
                        break;
                    case 5:
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
        }
    }
}
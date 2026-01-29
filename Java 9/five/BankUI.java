public class BankUI {
    BankAccount acctInterface = new BankAccount("HOLDER_NAME", 0, 0000);
    int mainMenu(int userInput) {
        switch (userInput) {
            case 1:
                acctInterface.deposit();
                break;
        
            default:
                break;
        }
    }
}

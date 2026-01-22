public class PiggyBankDriver2 {
    public static void main(String[] args) {
        PiggyBank2 piggyBank = new PiggyBank2(1.00);
        piggyBank.addMoney(0.32);
        System.out.println(piggyBank.getBalance());
    }
}

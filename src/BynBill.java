public class BynBill extends Bill {
    public BynBill(double balance) {
        super(balance);
        id = "Бел";
    }

    @Override
    public void showBalance() {
        System.out.print(balance);
        System.out.println(" BYN");

    }
}

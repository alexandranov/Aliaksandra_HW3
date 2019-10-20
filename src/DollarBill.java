public class DollarBill extends Bill {

    public DollarBill(double balance) {
        super(balance);
        id = "Доллары";
    }

    @Override
    public void showBalance() {
        System.out.print(balance);
        System.out.println(" USD");
    }
}

public class EurBill extends Bill {
    public EurBill(double balance) {
        super(balance);
        id = "Евро";
    }

    @Override
    public void showBalance() {
        System.out.print(balance);
        System.out.println(" EUR");
    }



}

public class User {
    public Account account;

    public User(Account account) {
        this.account = account;
    }

    public void showBalance(String id) {

        for (Bill bill : account.bills) {
            if (id == bill.id) {
                bill.showBalance();
            }
        }

    }

    public double subBalance(String id, double value) {
        for (Bill bill : account.bills) {
            if (id == bill.id) {
                return bill.subBalance(value);
            }
        }
        return 0;

    }


    public void addBalance(String id, double value) {
        for (Bill bill : account.bills) {
            if (id == bill.id) {
                bill.addBalance(value);
            }

        }
    }

}

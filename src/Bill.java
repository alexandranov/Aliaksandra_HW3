public abstract class Bill {
    protected double balance;
    public String id;

    public Bill(double balance) {
        this.balance = balance;
    }

    public abstract void showBalance();

    public double subBalance(double value) {
        if (balance < value) {
            double money = balance;
            balance = 0;
            return money;

        } else {
            balance -= value;
            return value;
        }
    }

    public void addBalance(double value) {
        balance += value;
    }
}

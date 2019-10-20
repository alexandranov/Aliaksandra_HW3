import java.sql.SQLOutput;

public class Bank {
    public static void main(String[] args) {


        System.out.println("Каждый счет имеет метод отображения баланса в своей валюте");
        Bill[] bills = new Bill[]{
                new EurBill(1),
                new DollarBill(2),
                new BynBill(3),
        };

        for (Bill bill : bills) {
            bill.showBalance();
        }

        System.out.println("Юзер долженн иметь возможность проверить баланс");
        Account account = new Account(bills);
        User user = new User(account);
        user.showBalance("Бел");

        System.out.println("Юзер долженн иметь возможность снять деньги");
        user.subBalance("Бел", 1);
        user.showBalance("Бел");

        System.out.println("Юзер долженн иметь возможность пополнить баланс");
        user.addBalance("Бел", 2);
        user.showBalance("Бел");

        System.out.println("Пользователь пытается снять больше денег чем есть на счету");
        double money = user.subBalance("Бел", 5);
        System.out.println(money);
        user.showBalance("Бел");

        System.out.println("Пользователь снимает деньги со всех счетов");
        user.subBalance("Евро", 10);
        user.subBalance("Доллары", 10);
        for (Bill bill : bills) {
            bill.showBalance();
        }

    }
}

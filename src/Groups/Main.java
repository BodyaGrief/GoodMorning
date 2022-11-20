package Groups;

import Groups.services.DepositService;

public class Main {
    public static void main(String[] args) {
        Person maks = new Person("Максим", "Иванченко", "+375291337228");
        Bill maksBill = new Bill(30);
        Account maksAcc = new Account(maks, maksBill);

        DepositService depService = new DepositService();
        depService.Increase(maksAcc);
    }
}

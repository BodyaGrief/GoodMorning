package Groups.services;
import Groups.Account;
import Groups.Bill;
import Groups.Person;

import java.util.Random;

public class DepositService {

    public void Increase(Account acc)
    {
        Random rand = new Random();
        Bill accBill = acc.getPersonBill();
        Person accPerson = acc.getHuman();

        System.out.println("Пользователь:");
        System.out.print("Имя:"+accPerson.getName()+" Фамилия:"+accPerson.getSurName()+" Телефон:"+accPerson.getTelephone()+"\n");

        System.out.println("Прежнее состояние счета: "+ accBill.getAmount());
        accBill.setAmount(rand.nextInt(1000, 10000));
        System.out.println("Текущее состояние счета: "+ accBill.getAmount());
    }
}

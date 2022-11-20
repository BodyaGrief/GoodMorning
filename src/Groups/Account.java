package Groups;

public class Account {
    private Person human;
    private Bill personBill;

    public Account(Person human, Bill personBill) {
        this.human = human;
        this.personBill = personBill;
    }

    public Person getHuman() {
        return human;
    }

    public Bill getPersonBill() {
        return personBill;
    }
}

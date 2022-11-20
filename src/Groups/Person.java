package Groups;

public class Person {
    private String name;
    private String surName;
    private String telephone;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getTelephone() {
        return telephone;
    }

    public Person(String name, String surName, String telephone) {
        this.name = name;
        this.surName = surName;
        this.telephone = telephone;
    }
}

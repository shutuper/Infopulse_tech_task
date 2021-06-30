package Task_3;

import java.util.Objects;

abstract class Person {

    private String firstName;
    private String LastName;
    private String telephone;

    public Person(String firstName, String lastName, String telephone) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.telephone = telephone;
    }

    public Person(Person person) {
        this.firstName = person.getFirstName();
        this.LastName = person.getLastName();
        this.telephone = person.getTelephone();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(LastName, person.LastName) && Objects.equals(telephone, person.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, LastName, telephone);
    }

    @Override
    public String toString() {
        return "Person: " +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", telephone='" + telephone;
    }
}

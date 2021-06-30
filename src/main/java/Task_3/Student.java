package Task_3;

import java.util.Objects;

public class Student extends Person {

    private int group_id;
    private int averagePoint;

    public Student(Person person, Group group) {
        super(person);
        this.group_id = group.getGroup_id();
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(int averagePoint) {
        if (averagePoint < 0) throw new IllegalArgumentException();
        this.averagePoint = averagePoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return group_id == student.group_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group_id);
    }

    @Override
    public String toString() {
        return "Student: " +
                "firstName='" + super.getFirstName() + '\'' +
                ", LastName='" + super.getLastName() + '\'' +
                ", telephone='" + super.getTelephone() + '\'' +
                ", group_id=" + group_id;
    }
}

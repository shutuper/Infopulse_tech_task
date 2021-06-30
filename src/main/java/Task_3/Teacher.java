package Task_3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Teacher extends Person {
    private List<Subject> subjects;
    private Cathedra cathedra;


    public Teacher(Person person, List<Subject> subjects) {
        super(person);
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Cathedra getCathedra() {
        return cathedra;
    }

    public void setCathedra(Cathedra cathedra) {
        this.cathedra = cathedra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(subjects, teacher.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subjects);
    }

    @Override
    public String toString() {
        return "Teacher's subjects:" + Arrays.toString(subjects.toArray());
    }
}

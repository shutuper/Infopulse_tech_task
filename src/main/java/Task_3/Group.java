package Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private final int group_id;
    private List<Student> students;
    private List<Subject> subjects;
    private Curator curator;

    public Group(int group_id, List<Student> students, List<Subject> subjects, Curator curator) throws IllegalArgumentException {
        if (students.size() > 30 || students.size() < 6) throw new IllegalArgumentException("In each group number of " +
                "students should be between [6,30]");
        this.group_id = group_id;
        this.students = students;
        this.subjects = subjects;
        this.curator = curator;
    }

    public int getGroup_id() {
        return this.group_id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Curator getCurator() {
        return curator;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public void setStudents(List<Student> students) throws IllegalArgumentException {
        if (students.size() > 30 || students.size() < 6) throw new IllegalArgumentException("In each group number of " +
                "students should be between [6,30]");
        this.students = students;
    }

    // cloning forbids users to reduce the size of list
    public List<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return group_id == group.group_id && Objects.equals(students, group.students) && Objects.equals(subjects, group.subjects) && Objects.equals(curator, group.curator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group_id, students, subjects, curator);
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}

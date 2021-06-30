package Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cathedra {
    private List<Group> groups;
    private List<Teacher> teachers;

    public Cathedra(List<Group> groups, List<Teacher> teachers) {
        if (groups.isEmpty() || teachers.size() < 3) throw new IllegalArgumentException();
        this.groups = groups;
        this.teachers = teachers;
    }

    // cloning forbids users to reduce the size of list
    public List<Group> getGroups() {
        return new ArrayList<>(groups);
    }

    public void setGroups(List<Group> groups) {
        if (groups.isEmpty()) throw new IllegalArgumentException();
        this.groups = groups;
    }

    // cloning forbids users to reduce the size of list
    public List<Teacher> getTeachers() {
        return new ArrayList<>(teachers);
    }

    public void setTeachers(List<Teacher> teachers) {
        if (teachers.size() < 3) throw new IllegalArgumentException();
        this.teachers = teachers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cathedra cathedra = (Cathedra) o;
        return Objects.equals(groups, cathedra.groups) && Objects.equals(teachers, cathedra.teachers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups, teachers);
    }
}

package Task_3;

import java.util.Objects;

public class Curator extends Teacher {
    private int group_id;

    public Curator(Teacher teacher, Group group) {
        super(teacher, teacher.getSubjects());
        this.group_id = group.getGroup_id();
    }

    public int getGroup_id() {
        return group_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Curator curator = (Curator) o;
        return group_id == curator.group_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group_id);
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }
}

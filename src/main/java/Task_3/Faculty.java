package Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private List<Cathedra> cathedras;

    public Faculty(List<Cathedra> cathedras) {
        if (cathedras.isEmpty()) throw new IllegalArgumentException();
        this.cathedras = cathedras;
    }

    public List<Cathedra> getCathedras() {
        return new ArrayList<>(this.cathedras);
    }

    public void setCathedras(List<Cathedra> cathedras) {
        if (cathedras.isEmpty()) throw new IllegalArgumentException();
        this.cathedras = cathedras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(cathedras, faculty.cathedras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cathedras);
    }
}

package Task_3;

import java.util.List;

public class University {
    private List<Faculty> faculties;
    private List<Subject> allSubjects;

    public University(List<Faculty> faculties, List<Subject> allSubjects) {
        this.faculties = faculties;
        this.allSubjects = allSubjects;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Subject> getAllSubjects() {
        return allSubjects;
    }

    public void setAllSubjects(List<Subject> allSubjects) {
        this.allSubjects = allSubjects;
    }

    @Override
    public String toString() {
        return "University: " +
                "faculties=" + faculties +
                ", allSubjects=" + allSubjects;
    }
}

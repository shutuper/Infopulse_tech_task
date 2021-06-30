package Task_3;

public class Subject {
    String name;
    int course;
    String duration;

    public Subject(String name, int course, String duration) {
        this.name = name;
        this.course = course;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Subject: " +
                "name='" + name + '\'' +
                ", course=" + course +
                ", duration='" + duration;
    }
}

package Tasks.Module_1_6.creational.prototype;

public class Student implements Copyable{
    private String name;
    private int course;
    private String faculty;

    public Student(String name, int course, String faculty) {
        this.name = name;
        this.course = course;
        this.faculty = faculty;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public Object copy() {
        Student copy = new Student(name , course, faculty);
        return copy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}

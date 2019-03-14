import java.lang.reflect.Array;

public class Course {
    private String name;
    private Teacher teacher;

    public Course(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher (Teacher b){
        teacher = b;
    }
}

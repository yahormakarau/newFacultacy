import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        List<Course> courses;
        List<Student> students;
        List<Teacher> teachers;

        Teacher Andrew = new Teacher("Andrew");
        Teacher Eugen = new Teacher("Eugen");
        Teacher Paul = new Teacher("Paul");

        Student yegor = new Student("yegor", "makarov");
        Student max = new Student("max", "mirniy");
        Student will = new Student("will", "neverdie");

        Course math = new Course("mAth");
        Course history = new Course("history");
        Course biology = new Course("biology");

        courses = new ArrayList<Course>();
        courses.add(math);
        courses.add(history);
        courses.add(biology);

        students = new ArrayList<Student>();
        students.add(yegor);
        students.add(max);
        students.add(will);

        teachers = new ArrayList<Teacher>();
        teachers.add(Andrew);
        teachers.add(Eugen);
        teachers.add(Paul);

        yegor.enrollToCourse(math);
        max.enrollToCourse(history);
        will.enrollToCourse(biology);

        Feedback seat = new Feedback("me here");
        System.out.println(seat.getFeedback());
    }
}
public class Teacher {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void markGrade(Student student, Course course, Grade mark) {
        student.setMark(mark);
    }

    public void leaveFeedback(Student student, Course course, Feedback feedback) {
        student.setFeedback(feedback);
    }
}

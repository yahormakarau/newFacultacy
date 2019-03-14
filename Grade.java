public class Grade {
    private Teacher teacher;
    private int mark;

    public Grade(Teacher teacher, int mark) {
        this.teacher = teacher;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

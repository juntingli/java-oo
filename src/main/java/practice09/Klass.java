package practice09;

import java.util.HashSet;

public class Klass {
    private Integer number;
    private Student student;
    private HashSet<Student> students;

    public Klass(Integer number) {
        this.number = number;
        this.students = new HashSet<>();
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student student) {
        if(students.contains(student)){
            this.student = student;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return student;
    }

    public void appendMember(Student student) {
        this.students.add(student);
    }
}

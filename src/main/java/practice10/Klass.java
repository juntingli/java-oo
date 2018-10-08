package practice10;

import java.util.HashSet;

public class Klass {
    private Integer classNumber;
    private Student student;
    private HashSet<Student> students;

    public Klass(Integer classNumber) {
        this.classNumber = classNumber;
        this.students = new HashSet<>();
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public String getDisplayName() {
        return "Class " + getClassNumber();
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

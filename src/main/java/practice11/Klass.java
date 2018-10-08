package practice11;

import java.util.HashSet;

public class Klass {
    private Integer classNumber;
    private Student student;
    private HashSet<Student> students;
    private HashSet<Teacher> teachers;

    public Klass(Integer classNumber) {
        this.classNumber = classNumber;
        this.students = new HashSet<>();
        this.teachers = new HashSet<>();
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
            for (Teacher teacher : teachers){
                System.out.print("I am " + teacher.getName() + ". I know " + student.getName() + " become Leader of Class " + classNumber + ".\n");
            }
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
        for (Teacher teacher : teachers){
            System.out.print("I am " + teacher.getName() + ". I know " + student.getName() + " has joined Class " + classNumber + ".\n");
        }
    }

    public void  appendTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    public Boolean isIn(Student student){
        return this.classNumber.equals(student.getKlass().getClassNumber());
    }
}

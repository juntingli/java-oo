package practice06;

public class Student extends Person{
    private Integer klass;

    public Student(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return "My name is " + getName() +". I am " + getAge() + " years old. I am a Student. I am at Class " + getKlass() + ".";
    }
}

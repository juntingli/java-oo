package practice10;

public class Student extends Person{
    private Klass klass;

    public Student(Integer id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(this == klass.getLeader()){
            return "My name is " + getName() +". I am " + getAge() + " years old. I am a Student. I am Leader of Class " + getKlass().getClassNumber() + ".";
        }
        return "My name is " + getName() +". I am " + getAge() + " years old. I am a Student. I am at Class " + getKlass().getClassNumber() + ".";
    }
}

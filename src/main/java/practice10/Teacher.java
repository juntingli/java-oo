package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klassLinkedList;

    public Teacher(Integer id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, int age, LinkedList<Klass> klassLinkedList) {
        super(id, name, age);
        this.klassLinkedList = klassLinkedList;
    }

    public LinkedList<Klass> getClasses() {
        return klassLinkedList;
    }

    public String printClass(){
        StringBuffer stringBuffer = new StringBuffer();
        for(Klass klass : klassLinkedList){
            stringBuffer.append(klass.getClassNumber() + ", ");
        }
        if(stringBuffer.toString().endsWith(", ")){
            return stringBuffer.toString().substring(0, stringBuffer.length() -2);
        }
        return null;
    }

    @Override
    public String introduce() {
        if(null != getClasses()){
            return "My name is " + getName() +". I am " + getAge() + " years old. I am a Teacher. I teach Class " + printClass() + ".";
        }
        return "My name is " + getName() +". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(getClasses().contains(student.getKlass())){
            return "My name is " + getName() + ". I am "+ getAge() +" years old. I am a Teacher. I teach "+ student.getName() +".";
        }
        return "My name is " + getName() + ". I am "+ getAge() +" years old. I am a Teacher. I don't teach "+ student.getName() +".";
    }

    public boolean isTeaching(Student student) {
        for(Klass klass : klassLinkedList){
            if(klass.getClassNumber().equals(student.getKlass().getClassNumber())){
                return true;
            }
        }
        return false;
    }
}

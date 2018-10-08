package practice10;

public class Person {
    private Integer id;
    private String name;
    private int age;

    public Person(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person person = (Person) obj;
            return this.id.equals(person.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}

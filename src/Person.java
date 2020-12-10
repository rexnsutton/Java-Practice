import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(String name){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age){
        return age;
    }

    public void sayHello(){
        System.out.println("Hello" + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 12);
        Person person2 = new Person("Rex", 23);
        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);


    }

}

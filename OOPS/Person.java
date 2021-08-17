package OOPS;

public class Person {
    String name;
    int age;
    Person(String n, int age) {
        name = n;
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nidhi", 23);
        System.out.println(p1.age);
        Person p2 = new Person("Shradha", 22);
        System.out.println(p2.name);
    }
}

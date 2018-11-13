package ch.hslu.oop.sw02;

public class Person {
    private String name;
    private int age;
    private String number;
    private int credits;

    public Person(String myName, int myAge) {
        name = myName;
        age = myAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void printDetails() {
        System.out.println("The Name of this person is " + name);
    }
}
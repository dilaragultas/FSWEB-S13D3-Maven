package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String hairColor;
    double height;
    double weight;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String hairColor, double height, double weight){
        this(firstName, lastName, age);
        this.hairColor = hairColor;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age>= 13 && age<= 19;
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        Dog animal = new Dog();
        //Inheritance because the Dog object  is using the variables created in the Animal class.
        animal.setAge(5);
        animal.setType("dog");
        animal.setName("Charlie");
        System.out.println("The animal is a: " + animal.getType() + " The animal's name is: " + animal.getName() + " and their age is: " + animal.getAge() + " years old");
        animal.speak();
    }
}
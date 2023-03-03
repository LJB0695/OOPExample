package org.example;

public class Dog extends Animal{
    //Using inheritance by extending the animal class and using the method speak.


    @Override
    public void speak() {
        System.out.println("Bark");//This is method overriding. It is an example of polymorphism.
    }
}

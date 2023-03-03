package org.example;

public abstract class Animal {
    //Creating an abstract class and abstract method for Abstraction.
    public abstract void speak();
    //Using encapsulation by making the variables private and then creating getters and setters.
    private String name;
    private int age;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package com.Mykyta;

public class Main {


    // Created a basic program based on the prince of OOP inheritance.
    // Using Animal as a basic class that transfers its parameters to Dog and to Fish.


    public static void main(String[] args) {


    Animal animal = new Animal("Animal",1,1,5,5);

    Dog dog = new Dog("Yorkie",8, 20,2,4,1,20,"long silky");

    dog.eat();

    dog.run();

    dog.walk();

    }
}

package OOPS;

public class inheritance {
    public static void main(String[] args) {

        Mamels kesherGad = new Mamels();
        kesherGad.color = "wazul";
        System.out.println(kesherGad.color);
        kesherGad.eat();

    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breaths");
    }
}

// SINGLE LEVEL INHERITANCE
// Derived Class
class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swims in Water");
    }
}

// MULTI LEVEL INHERITANCE
// Derived Class
class Mamels extends Fish {
    String human;
}
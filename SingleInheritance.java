// Single inheritance example
class Animals {
    Animals() {
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animals {
    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}
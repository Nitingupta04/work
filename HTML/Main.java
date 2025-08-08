class Animal1 {
    String name = "Animal";

    Animal1() {
        System.out.println("-- I am from Animal def cons --");
    }

    void display() {
        System.out.println("-- I am from display in Animal --");
    }
}

class Dog extends Animal1 {
    String name = "Dog";

    Dog() {
        System.out.println("-- I am Def cons from Dog class --");
    }

    void showName() {
        System.out.println("-- this.name value = " + this.name);
        System.out.println("-- super.name value = " + super.name); // Fixed line
    }

    void display() {
        System.out.println("-- I am from display in Dog --");
    }

    void callMethods() {
        System.out.print("-- Here we are calling the value for this ref var --");
        this.display();
        System.out.println("===========================");
        System.out.print("-- Here we are calling the value for super ref var --");
        super.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showName();
    }
}

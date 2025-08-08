import java.util.*;

interface Animal {
    void sleeping();

    void eating();

    default void runing() {
        System.out.println("-- Animal is runing --");
    }
}

class Dog implements Animal {

    @Override
    public void sleeping() {
        System.out.println("-- Dog is sleeping --");

    }

    @Override
    public void eating() {
        System.out.println("-- Dog is eating --");

    }

    public void runing() {
        System.err.println("-- Dog is runing --");
    }

}

class Rabbit implements Animal {

    @Override
    public void sleeping() {
        System.out.println("-- Rabbit is sleeping --");
    }

    @Override
    public void eating() {
        System.out.println("-- Rabbit is eating --");

    }

    public void sneaking() {
        System.out.println("-- Rabbit is sneaking --");
    }

    public void runing() {
        System.out.println("-- Here we are overriding void runing () inside Animal --");
    }
}

class Cat implements Animal {

    @Override
    public void sleeping() {
        System.out.println("-- Cat is sleeping --");

    }

    @Override
    public void eating() {
        System.out.println("-- Cat is eating --");

    }

    public void runing() {
        System.err.println("-- Cat is runing --");
    }

}

class Test {

    public static void main(String[] args) {
        //Optional<String> op1 = Optional.empty();
        // System.out.println(op1);
        // System.out.println(op1.toString());

        // Optional op2 = Optional.empty();
        // System.err.println(op2);
        // System.out.println(op2.toString());

        // System.err.println(op1 == op2);
        // System.out.println(op1.hashCode());
        // System.out.println(op2.hashCode());

        TreeSet studentName = new TreeSet();
        
        studentName.add("Kavya L.");
        studentName.add("Tushar U");
        studentName.add("Meera D");
        studentName.add("Farhan T");
        studentName.add("Nikhil H");
        studentName.add("Devika R");
        studentName.add("Lakshay W");
        studentName.add("Kavya L.");       

        System.out.println(studentName);

    }
}

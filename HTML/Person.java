class Person implements Cloneable {
    String name;

    Person(String name) { // Constructor to initialize name
        this.name = name;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone(); // Call the Object's clone method
    }

    public static void main(String[] args) {
        try {
            Person p1 = new Person("John");
            Person p2 = p1.clone();            
            System.out.println("Person1's name: " + p1.name); 
            System.out.println("Person2's name: " + p2.name);            
            p2.name = "Mike";            
            System.out.println("After renaming Person2...");
            System.out.println("Person1's name: " + p1.name);
            System.out.println("Person2's name: " + p2.name);
        } 
        
        catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}

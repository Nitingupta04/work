import java.util.*;
class Clolectiontest{

    public static void main(String[] args) {

        /*Vector vector = new Vector();
        vector.add("Nitin");
        vector.add("Gupta");
        vector.add(123);
        vector.add(767.98);
        System.out.println("Value of vector = "+ vector);

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Object object = enumeration.nextElement();
            System.out.println(object);            
        }*/

        Properties properties = new Properties();
        for(int i =1; i <= 1000; i ++){
        properties.put(i, "Nitin"+i);
        
    }
    System.out.print("  |  "+properties);



        
        
    }

}
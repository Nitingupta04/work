import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Genericeg {
    public static void main(String[] args) {
        System.out.println("-- Without Gen --");
        List list = new ArrayList();
        list.add("Manish");
        list.add("Hello");
        list.add("Welcome");
        list.add(new Integer(12));

        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj =it.next();
            if (obj instanceof Integer) {
                Integer in = (Integer)obj;
                System.out.println(in);               
            }
            
            else if(obj instanceof String){
                String str = (String)obj;
                System.out.println(str);
            }
        }

        System.out.println("-- With Generics --");
        List <String> list1 = new ArrayList<String>();
        list.add("Manisj");
        list.add("Sunil");
        list.add("Sundar");
        list.add(new Integer(12));

        Iterator <String> it1 = list1.iterator();

        while(it1.hasNext()){
            String str = it1.next();
            System.out.println(str);
        }

        Map<Integer,String> map = new LinkedHashMap<Integer, String>();
        map.put(1234, "Som");
        map.put(8767, "Praksh");
        map.put(5677, "Manish");
        map.put(2343, "Rai");
        map.put(9898, "Chandan");

    }
        
    
}

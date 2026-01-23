package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFramee {
    // LIST - ArrayList , LinearList 
    // QUEUE - Dequeue 
    // SET - HashSet , LinkedHashSet
    //Map - 
   public static void main(String[] args) {
// ARRAY LIST
    List<Integer> num = new ArrayList<Integer>();
    num.add(3);
    num.add(45);
    num.add(34);
    num.add(34);

    List<Integer> nums = Arrays.asList(4,5,6,7);
    nums.forEach(n-> System.out.println(n));    System.out.println(num);
/*
    for (int object : num) {
        System.out.println(object);
    }
// SET -unique values 
//TreeSet - sorted 

Set<Integer> num2 = new TreeSet<>();
    num2.add(93);
    num2.add(45);
    num2.add(34);
    num2.add(34);
    System.out.println("SET USED with TreeSet");
    for (int object : num2) {
        System.out.println(object);
    }
// HASHSET - unsorted , random , no index
Set<Integer> num1 = new HashSet<>();
    num1.add(93);
    num1.add(45);
    num1.add(34);
    num1.add(34);
    System.out.println("SET USED with hashSet");
    for (int object : num1) {
        System.out.print(object +" ");
    }
// Iterator
Iterator<Integer> values = num1.iterator();
while (values.hasNext()) {
    System.out.println(values.next());
}
//MAP - key value pair 
System.out.println("MAP");
Map<String,Integer> stuMap =new HashMap<>();
stuMap.put("one", 34);
stuMap.put("two", 4);
stuMap.put("three", 3);

System.out.print(stuMap.get("three")+" ");
for(String name : stuMap.keySet()){
    System.out.println(name+": "+stuMap.get(name));
}
//HASHTABLE
 */
}
   }
   

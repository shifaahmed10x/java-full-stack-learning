package udemy;
import java.lang.classfile.ClassFile.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

class student{
    private int age;
    private String name;

    public student(){

    }
    public student(String name){
        this.name=name;
    }
    public student(int age){
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "student [age=" + age + ", name=" + name + "]";
    }
    
    
}
public class UseStreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        // Use of SteamPI
        List<Integer> nums = numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .toList();
        System.out.println(nums);

        // parrallelStream
        int size = 10_000;
        List<Integer> n = new ArrayList<>(size);
        Random ran = new Random();
        for (int i = 1; i < size; i++) {
            n.add(ran.nextInt(100));
        }
        //System.out.print(" " + n);
        int sum = n.stream()
                 .map(i->i*2)
                 .reduce(0,(c,e)->c+e);
        
        int sum2 = n.stream()
        .map(i->i*2)
        .mapToInt(i->i)
        .sum();

        int sum3 = n.parallelStream()
        .map(i->i*2)
        .mapToInt(i->i)
        .sum();
 System.out.println(sum3 + " "+ sum2);
//Optional - REMOVE NULL POINTER EXCEPTION 
List<String> srt= Arrays.asList("Navin","Shifa","Mai");

Optional<String> s= srt.stream()
.filter(i->i.contains("x"))
.findFirst();    
System.out.println(s.orElse("NOT FOUND"));

//MethodReferenceEx:
List<String> names= Arrays.asList("Navin","Shifa","Mai");

List<String> s1 = names.stream()
.map(String::toUpperCase)
.toList();

s1.forEach(System.out::println);
//Constructor Referance 

List<student> students = new ArrayList<>();
// for(String name: names){
//     students.add(new student(name));
// }

students = names.stream()
.map(student::new) //name-> new student(name)
.toList();

System.out.println(students);
}
}
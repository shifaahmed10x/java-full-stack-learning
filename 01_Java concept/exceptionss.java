package udemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception
{
    public MyException(String s){
        super(s);
    }
}
public class exceptionss {
    public static void main(String[] args) {
        System.out.println("ENTER AGE:");
    // work with io 
    try {
        InputStreamReader in = new InputStreamReader(System.in);
   BufferedReader bf = new BufferedReader(in);

    int num = Integer.parseInt(bf.readLine());
    System.out.println(num); 
        bf.close();
 
    } catch (IOException e) {
        System.out.println("NOTHING");
  }
   
   
    }
}

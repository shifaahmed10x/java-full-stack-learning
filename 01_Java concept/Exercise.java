package udemy;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class Exercise {
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or older");
        }
        System.out.println("Access granted");
    }
    
    
    public static void main(String[] args) {
        // TODO: Call checkAge(16) and checkAge(21) inside separate try-catch blocks
         try{
         checkAge(16);
         }
         catch(InvalidAgeException e){
             System.out.println("Exception caught:"+e.getMessage());
         }
         try {
            checkAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}


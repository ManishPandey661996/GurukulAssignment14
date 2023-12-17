import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String name = sc.nextLine();

        try {
            Namecheck(name);
        } catch (NoMatchException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }    
    

    private static void Namecheck(String name) throws NoMatchException {
        if (!name.equals("India")) {
            throw new NoMatchException("Expected 'India', got '" + name + "'");
        }
    } 
}           
   
    class NoMatchException extends Exception {

        public NoMatchException(String message) {
            super(message);
        }
    }



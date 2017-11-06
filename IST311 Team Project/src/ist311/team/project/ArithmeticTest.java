
package ist311.team.project;

/**
 *
 * @author Adrian
 * 
 * This will be the main tester for our application
 */
import java.util.Scanner;

public class ArithmeticTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        GreetingDisplay user = new GreetingDisplay();
        System.out.println("What is your name?");
        String name = input.next();
        user.setName(name);
        user.display(name);
        
        
        
    }
    
}

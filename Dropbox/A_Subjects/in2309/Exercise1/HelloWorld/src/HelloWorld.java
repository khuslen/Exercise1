/**
 * 
 */
import java.util.Scanner;
/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");
		
		Scanner userInput = new Scanner(System.in);
		String name;
		System.out.print("Please enter your name: ");
		name = userInput.next();
		
		HelloUser newUser = new HelloUser(name);
		newUser.greetUser();
		
		userInput.close();
	}
}

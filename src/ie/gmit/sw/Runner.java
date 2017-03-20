package ie.gmit.sw;
import java.util.*; 

public class Runner {
	private static Scanner scanner = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		mainMenu();
	}//main
	
	public static void mainMenu()
	{
		
		int input = 0;
		
		do{
			
		//input = UserInput
			
		System.out.println("Please choose one: \n");
		System.out.println("\t1.Parse");
		System.out.println("\t2.Decrypt");
		System.out.println("\t3.End");
		input = scanner.nextInt();
		
		input = scanner.nextInt();
		
		switch(input)
		{
		case 1:
			break;
		case 2:
			break;
		case -1:
			break;
			default:System.out.println("Invalid");
		}
		
		}while(input != -1);
		
	}//mainMenu
	private static int UserInput(String output){
		
		System.out.println(output);
		int input = scanner.nextInt();
		return input;
	}//inputs
}

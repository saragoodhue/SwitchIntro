import java.util.Scanner;

public class switchIntro
	{

		public static void main(String[] args)
			{
				Scanner userStringInput = new Scanner (System.in);		
				System.out.println("What is your name?");		
				String name = userStringInput.nextLine();		
				System.out.println("Hello, " + name + "!");
				
				switch (name) 
					{
						case "a":								{
									System.out.println("We're a match!");
								}
						default:
								{
									System.out.println("Not a match :(");
								}
					}

			}

	}

import java.util.Scanner;

public class Autorijden
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wat is je leeftijd?");
		String age = input.next();
		System.out.println("Heb je een rijbewijs? Y voor ja of N voor nee");
		String license = input.next();
		
		try
		{
			int ageInt = Integer.parseInt(age);
			
			if(license.equals("Y") || license.equals("N"))
			{			
				if(ageInt >= 18 && license.equals("Y"))
				{
					System.out.println("\nJe bent " + ageInt + " met rijbewijs, dus je mag autorijden.");
				}
				else
				{
					System.out.println("\nJe bent " + ageInt + " jaar oud, dus je mag nog niet autorijden.");
				}
			}
			else
			{
				System.out.println("\nERROR: Je hebt geen valide antwoord ingevuld. Probeer het opnieuw.\n\n");
				main(args);
			}
				
		}
		catch(NumberFormatException e)
		{
			System.out.println("\nLAST ERROR: Je hebt geen valide antwoord ingevuld. Probeer het opnieuw.\n\n");
			//main(args);
		}
	}
}
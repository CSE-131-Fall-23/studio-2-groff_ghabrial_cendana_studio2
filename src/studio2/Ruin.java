package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What is the starting amount of money that you have?");
		int startAmount0 = in.nextInt();
		System.out.println("What is the win chance of winning a game as a percent?");
		double winChance = in.nextInt();
		System.out.println("What is an amount of money you are happy leaving with?");
		int winLimit = in.nextInt();
		System.out.println("How many simulations do you want to run?");
		int totalSimulations = in.nextInt();


		winChance = winChance / 100.0;
		
		
		int wins = 0;
		int losts = 0;
		
		for (int Simulations = 1; (Simulations-1) < totalSimulations; Simulations++)
		{
			int plays = 0;
			int startAmount = startAmount0;
			while (startAmount > 0 && startAmount != winLimit)
			{	
				double probablity = Math.random();
				if (probablity > winChance)
				{
					startAmount= startAmount - 1;
					plays++;
				}
				else if (probablity < winChance)
				{
					startAmount++;
					plays++;
				}
			}
			

			if (startAmount == 0)
			{
				System.out.println("Ruin "+Simulations+ " plays: "+plays);
				losts++;
			}
			else if (startAmount == winLimit)
			{
				System.out.println("Win "+Simulations+" plays: "+ plays);
				wins++;	
			}

		}
		double ruinrate = losts/totalSimulations;
		if (winChance == 0.5)
		{
			
		}

	}
}

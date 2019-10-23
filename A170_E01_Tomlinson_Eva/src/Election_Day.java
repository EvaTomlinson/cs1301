// ***************************************************************
//   Election_Day.java
//
//   This file contains a program that tallies the results of
//   an election.  It reads in the number of votes for each of
//   two candidates in each of several precincts.  It determines
//   the total number of votes received by each candidate, the
//   percent of votes received by each candidate, the number of 
//   precincts each candidate carries, and the 
//   maximum winning margin in a precinct.
// **************************************************************
import java.util.Scanner;
public class Election_Day
{
    public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many precincts?");
		int numberOfPrcincts = scanner.nextInt();
		int votesForJason = 0;
		int votesForFreddie = 0;
		while (true) {
			int i;
			for (i = 1; i <= numberOfPrcincts ; i++) {
				System.out.println("Please enter how many votes that Jason got: ");
				votesForJason += scanner.nextInt();
				System.out.println("Please enter how many votes that Freddie got: ");
				votesForFreddie += scanner.nextInt();
			}
			System.out.println("Do you want to countinue adding votes? (yes/no)");
			String addMorevotes = scanner.next();
			if (addMorevotes.equalsIgnoreCase("yes")) {
				votesForJason += votesForJason;
				votesForFreddie += votesForFreddie;
			} else {
				break;
			}
		}
		System.out.println("Jason has " + votesForJason +  " votes.");
		double jasonVotePercentage = 100. * votesForJason / (votesForJason + votesForFreddie);
		System.out.println("The percentage of Jason's vote is " + jasonVotePercentage + "%");
		System.out.println("Freddie has " + votesForFreddie + " votes.");
		double freddieVotePercentage = 100. * votesForFreddie / (votesForJason + votesForFreddie);
		System.out.println("The percentage of Freddie's vote is " + freddieVotePercentage + "%");
		scanner.close();
		}
	}









// 	int votesForJason;  // number of votes for Jason in each precinct
// 	int votesForFreddie; // number of votes for Freddie in each precinct
// 	int totalJason;     // running total of votes for Jason
// 	int totalFreddie;    // running total of votes for Freddie
// 	String response;    // answer (y or n) to the "more precincts" question

// 	Scanner scan = new Scanner(System.in);

// 	System.out.println ();
// 	System.out.println ("Election Day Vote Counting Program");
// 	System.out.println ();



// 	// Initializations

// 	// Loop to "process" the votes in each precinct

// 	// Print out the results
//     }
// }

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Movie movie = new Movie();
		
		String userAnswer;
		
		do {
			
			System.out.print("\nEnter movie Title: ");
			movie.setTitle(scan.nextLine());
			
			System.out.print("Enter movie ratings: ");
			movie.setRating(scan.nextLine());

			System.out.print("Enter number of tickets sold: ");
			movie.setSoldTickets(scan.nextInt());
			scan.nextLine();
			
			System.out.println("\n" + movie.toString());
			
			do {
				
				System.out.print("\nWould you like to continue? (Y/N): ");
				userAnswer = scan.nextLine();
				
				if (!userAnswer.equals("Y") && !userAnswer.equals("y") && !userAnswer.equals("N") && !userAnswer.equals("n")) {
					System.out.println("Invalid input. Try again.");
				}
				
			} while (!userAnswer.equals("Y") && !userAnswer.equals("y") && !userAnswer.equals("N") && !userAnswer.equals("n"));
			
			
			if (userAnswer.equals("N") || userAnswer.equals("n")) {
				System.out.println("Ending the program...");
				System.exit(0);
			}
			
			
		} while(userAnswer.equals("Y") || userAnswer.equals("y"));
		
		
		
	}

}

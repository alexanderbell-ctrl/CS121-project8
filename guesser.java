import java.util.Scanner;
import java.util.Random;

public class guesser {
	Scanner userInput = new Scanner(System.in);

	public static void main(String[] args){
		new guesser();
	} //end main
	public guesser(){
		boolean keepGoing = true;
		while (keepGoing) {
			String response = menu();
			if (response.equals("0")) {
				keepGoing = false;
			} //end if 0
			if (response.equals("1")) {
				humanGuesser();
			} //end if 1
			if (response.equals("2")) {
			
			} //end if 2
		} //end while
	} //end guesser
	public String menu() {
		System.out.println("Select an Option...");
		System.out.println("0) Quit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");
		String response = userInput.nextLine();
		return response;
	} //end menu
	public void humanGuesser() {
		Random rand = new Random();
		int turns = 0;
		int guess = 0;

		int randMax = 100;
		int randMin = 1;
		int num = rand.nextInt(randMax - randMin + 1) + randMin;
		
		System.out.println(num);

		boolean keepGoing = true;
		while(keepGoing){
			turns += 1;
			System.out.print("Please enter your guess:");
			String response = userInput.nextLine();
			int numresponse = Integer.parseInt(response);
			if (numresponse < num){
				System.out.println(turns + ") Too Low");
			} //end if low
			if (numresponse > num){
				System.out.println(turns + ") Too High");
			} //end if high
			if (numresponse == num){
				System.out.println(turns + ") Correct");
				keepGoing = false;
			} //end if =
		} //end while

		if (turns < 7){
			System.out.println("You Win!");
		} //end if turns win
		if (turns > 7){
			System.out.println("You Lose... More than 7 guess attempts");	
		} //end if turns lose
		if (turns == 7){
			System.out.println("Try again... Try and make less than 7 guesses");
		} //end if turns tie
	} //end humanGuesser()
} //end guesser

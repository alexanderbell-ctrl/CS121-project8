import java.util.Scanner;

public class guesser {
	Scanner userInput = new Scanner(System.in);

	public static void main(String[] args){
		new guesser();
	} //end main
	public void guesser(){
		String response;
		boolean keepGoing = true;
		while (keepGoing) {
			response = menu();
			if (response == "0") {
				
			} //end if 0
			if (response == "1") {
			
			} //end if 1
			if (response == "2") {
			
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
} //end guesser

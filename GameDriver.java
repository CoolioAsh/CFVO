package alpha;
import java.io.IOException;
import java.util.Scanner;
public class GameDriver {
	public static void main (String [] args) throws IOException{
	System.out.println("Welcome to the Alpha version of Cardfight Vanguard!! Online");
	System.out.println("Current version has the following abilities/features:");
	
	Scanner keyinput = new Scanner(System.in);
	RulesReadIn rulebook = new RulesReadIn();
	DeckReadIn decklists = new DeckReadIn();
	String gamestart;
	int optionchoice;
	
	System.out.println("What would you like to do?");
	System.out.println("You can browse the following options:");
	System.out.println("1. Browse The Game Rules");
	System.out.println("2. Browse Current Decks");
	System.out.println("3. Browse The Card Database");
	System.out.println("4. Browse Previous Games");
	System.out.println("5. Browse Recommended Deck Builds");
	System.out.println("6. Browse Settings");
	System.out.println("7. Start a New Game");
	optionchoice = keyinput.nextInt();
	if(optionchoice <= 0 || optionchoice >= 8){
		System.out.println("Invalid Input, Try Again");}
	else if(optionchoice == 1){
		System.out.println("Here are the game rules!");
		System.out.println("Opening...");
		rulebook.ReadIn();}
	else if(optionchoice == 2){
		System.out.println("Here are the decks that are in the system");
		decklists.ReadIn();}
	else if(optionchoice == 3){
		System.out.println("Starting up the Card Database...");
		//carddatabase.open();
							}
	else if(optionchoice == 4){
		System.out.println("Please pick a game to review:");
		//oldgames.open();
								}
	else if(optionchoice == 5){
		System.out.println("Opening the list of suggested decks");
		//suggested.open();
	}
	else if(optionchoice == 6){
		System.out.println("Starting a new game...");
		//negame.start();
	}
	}
}
		



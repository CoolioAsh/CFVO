package alpha;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DeckReadIn {
	private String [] decklist = new String[1];
	private int value;
	public void ReadIn() throws IOException{
		Scanner keyboard = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new FileReader("decklist.txt"));
		System.out.println("How many decks do you wish to look over?");
		value = keyboard.nextInt();
		for(int ri = 0;ri<value;++ri){
			decklist[ri] = br.readLine();
			System.out.println(decklist[ri]);}
		keyboard.close();
		br.close();
	}
}

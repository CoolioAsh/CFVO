package alpha;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeckReadIn {
	
	private ArrayList<String> decklist = new ArrayList<String>();
	private int value;
	
	public ArrayList<String> ReadIn() throws IOException{
		Scanner keyboard = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new FileReader("decklist.txt"));
		System.out.println("How many decks do you wish to look over?");
		value = keyboard.nextInt();
		for(int ri = 0;ri<value;++ri){
			decklist.add(br.readLine());
			}
		keyboard.close();
		br.close();
		return decklist;
	}
}

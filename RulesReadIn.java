package alpha;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RulesReadIn {
	
	private String [] rulelist = new String[32];
	
	public void ReadIn() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("alpha/rules.txt"));
		for(int ri = 0;ri<32;++ri){
			rulelist[ri] = br.readLine();
			System.out.println(rulelist[ri]);}
		br.close();
	}
}

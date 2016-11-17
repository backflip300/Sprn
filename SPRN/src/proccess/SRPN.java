package proccess;

import java.util.ArrayList;
import java.util.Scanner;

public class SRPN {
	
	static ArrayList<String> input = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inputter inputter = new Inputter(input);
		Validater validater = new Validater();
		Calculater calculater = new Calculater();
		Scanner in = new Scanner(System.in);
		String rawInput;
		boolean ended = false;
		while(ended == false){
			rawInput = in.nextLine();
			
			ended = inputter.sortInput(rawInput);
		}
	}	
}

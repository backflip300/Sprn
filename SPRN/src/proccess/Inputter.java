package proccess;

import java.util.ArrayList;
import java.util.Random;

public class Inputter {

	ArrayList<String> inputs = new ArrayList<String>();
	int prevInputStatus = 0;

	// 0: started,1: number being input.

	public Inputter(ArrayList<String> inputs) {
		this.inputs = inputs;
	}

	public boolean sortInput(String input) {
		boolean finishedInput = false;
		String InputTrim;
		int previousCut = 0;

		for (int i = 0; i < input.length(); i++) {

			if (Character.isDigit(input.charAt(i))) {
				previousCut = i;
				for (int a = i; a < input.length(); a++) {

					if (Character.isDigit(input.charAt(a)) == false) {
						inputCut(input, previousCut, a);
						previousCut = a + 1;
						i = a - 1;

						break;
					} else if (a == input.length() - 1) {
						inputCut(input, previousCut, a + 1);
						previousCut = a + 1;
						return false;
					}
				}
				continue;
			} else if (input.charAt(i) == '=') {
				return true;
			} else if (input.charAt(i) == '#') {
				System.out.println("got here");
				i = input.length();
				
			}else if(charAt(i) == 'r'){
				Random rand = new Random();
				rand.nextInt(100000);
			}else if(charAt(i) == 'd'){
				
			}else if(charAt(i) == ' '){
				continue;
				
			}
		}

		/*
		 * for(int i = 0;i<input.length();i++){
		 * if(Character.is(input.charAt(i)){ InputTrim =
		 * input.substring(previousCut, i); previousCut = i+1;
		 * System.out.println(InputTrim); } } if(previousCut != input.length()){
		 * InputTrim = input.substring(previousCut,input.length());
		 * System.out.println(InputTrim); }
		 */
		return finishedInput;
	}

	private char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void printStack() {
		// TODO Auto-generated method stub
		
	}

	private void inputCut(String input, int trimStart, int TrimEnd) {
		inputs.add(input.substring(trimStart, TrimEnd));
		System.out.println("input: " + input.substring(trimStart, TrimEnd));
	}

}

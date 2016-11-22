package proccess;

import java.util.Random;

public class Inputter {

	Stack stack;
	private int negFlag = 1;
	Calculater calculater;

	// 0: started,1: number being input.

	public Inputter(Stack stack) {
		this.stack = stack;
		calculater = new Calculater(this.stack);
	}

	public void sortInput(String input) {
		int previousCut = 0;

		for (int i = 0; i < input.length(); i++) {

			char currentChar = input.charAt(i);
			if (Character.isDigit(currentChar)) {
				previousCut = i;
				for (int a = i; a < input.length(); a++) {
					if (Character.isDigit(input.charAt(a)) == false && input.charAt(a) != '.') {
						inputCut(input, previousCut, a);
						previousCut = a + 1;
						i = a-1;
						break;
					} else if (a == input.length() - 1) {
						inputCut(input, previousCut, a + 1);
						previousCut = a + 1;
						i = a;

						break;

					}
				}
			} else {
				switch (currentChar) {
				case ('='):
					stack.peekTop();
					break;
				case ('#'):
					i = input.length();
					break;
				case (' '):

					break;
				case ('r'):
					Random rand = new Random();
					stack.push(rand.nextInt(100000));

					break;
				case ('d'):
					stack.peekAll();
					break;
				case ('/'):
					calculater.divide();
					break;
				case ('*'):
					calculater.Multiply();
					break;
				case ('+'):
					calculater.Add();
					break;
				case ('^'):
					calculater.Power();
					break;
				case ('-'):
					if (i != input.length() && Character.isDigit(input.charAt(i + 1))) {
						negFlag = -1;
					} else {
						calculater.divide();
					}
					break;
				default:
					System.out.println("incorrect input");
					i = input.length();
					break;
				}
			}
		}

	}

	private void inputCut(String input, int trimStart, int trimEnd) {
		String cutString = input.substring(trimStart,trimEnd);
		Double toPush;
		if(cutString.charAt(0) == '0'){
			toPush = convertToOctal(cutString);
		}else{
			toPush = Double.parseDouble(input.substring(trimStart, trimEnd));
		}
		stack.push(negFlag * toPush);
		negFlag = 1;
	}

	private Double convertToOctal(String toConvert) {
		toConvert = toConvert.substring(1);
		Double Octal = 0.0;
		int decimalPointLocation = -1;
		int startValue = 0;
		int decimalOffset = 0;
		int endValue = toConvert.length();
		for(int i =0;i<toConvert.length();i++){
			if(toConvert.charAt(i) == '.'){
				System.out.println("has a decimal");
				decimalPointLocation = i;
				startValue = i -1;
			}
			if(toConvert.charAt(i) == '8' || toConvert.charAt(i) == '9'){
				endValue = toConvert.length();
			}
		}
		
		if(decimalPointLocation == -1){
			System.out.println("no decimal");
			startValue = toConvert.length()-1;
		}
		System.out.println("dpl: " + decimalPointLocation);
		for(int i =0;i<endValue;i++){
			if(i == decimalPointLocation){
				decimalOffset = -1;
				continue;
			}
			System.out.println("start value" + startValue);
			System.out.println("power" + Math.pow(8,  startValue-(i + decimalOffset)));
			Octal += Double.parseDouble(toConvert.substring(i, i+1)) * Math.pow(8, startValue-(i + decimalOffset));
		}
		
		
		return Octal;
	}

}

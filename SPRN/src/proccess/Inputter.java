package proccess;

import java.util.ArrayList;
import java.util.Random;

public class Inputter {

	Stack stack = new Stack();
	private int negFlag = 1;
	Calculater calculater = new Calculater(stack);

	// 0: started,1: number being input.

	public Inputter(Stack stack) {
		this.stack = stack;
	}

	public void sortInput(String input) {

		String InputTrim;
		int previousCut = 0;

		for (int i = 0; i < input.length(); i++) {

			char currentChar = input.charAt(i);

			if (Character.isDigit(currentChar)) {
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
					}
				}
				continue;
			} else {
				switch (currentChar) {
				case ('='):
					stack.peekTop();
					break;
				case ('#'):
					i = input.length();
					break;
				case(' '):
					
				break;
				case ('r'):
					Random rand = new Random();
					stack.push(rand.nextInt(100000));

					break;
				case ('d'):
					stack.peekAll();
					break;
				case ('\\'):
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

	private char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void printStack() {
		// TODO Auto-generated method stub

	}

	private void inputCut(String input, int trimStart, int TrimEnd) {
		stack.push(negFlag * Integer.parseInt(input.substring(trimStart, TrimEnd)));
		negFlag = 1;
	}

}

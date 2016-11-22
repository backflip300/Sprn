
public class Inputter {
	RandomNumber rand;
	Stack stack;
	boolean Octal;
	private int negFlag = 1;
	Calculater calculater;

	// 0: started,1: number being input.

	public Inputter(Stack stack) {
		this.stack = stack;
		calculater = new Calculater(this.stack);
		rand = new RandomNumber();
	}

	public void sortInput(String input) {
		int previousCut = 0;

		for (int i = 0; i < input.length(); i++) {
			Octal = false;
			char currentChar = input.charAt(i);
			if (Character.isDigit(currentChar)) {
				if (currentChar == '0') {
					Octal = true;
				}
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
						i = a;
						break;
					}

					/*
					 * else if(Octal == true && (input.charAt(a) == '8'||
					 * input.charAt(a) == '9')){ inputCut(input, previousCut,
					 * a); previousCut = a + 1; i = a - 1; }
					 */
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
					stack.push(rand.getRandom());

					break;
				case ('d'):
					stack.peekAll();
					break;
				case ('/'):
					if (!stack.checkUnderflow(2))
						calculater.divide();
					break;
				case ('*'):
					if (!stack.checkUnderflow(2))
						calculater.Multiply();
					break;
				case ('+'):
					if (!stack.checkUnderflow(2))
						calculater.Add();
					break;
				case ('^'):
					if (!stack.checkUnderflow(2))
						calculater.Power();
					break;
				case ('-'):
					if (i != input.length()
							&& Character.isDigit(input.charAt(i + 1))) {
						negFlag = -1;
					} else {
						if (!stack.checkUnderflow(2))
							calculater.divide();
					}
					break;
				default:
					System.err.println("Unrecognised operator or operand \""
							+ currentChar + "\"");
					break;
				}
			}
		}

	}

	private void inputCut(String input, int trimStart, int trimEnd) {

		if (stack.checkOverflow(1)) {
			return;
		}
		String cutString = input.substring(trimStart, trimEnd);
		Double toPush;
		if (cutString.charAt(0) == '0') {
			toPush = convertToOctal(cutString);
		} else {
			toPush = Double.parseDouble(input.substring(trimStart, trimEnd));
		}

		stack.push(negFlag * toPush);
		negFlag = 1;
	}

	private Double convertToOctal(String toConvert) {
		toConvert = toConvert.substring(1);
		for (int i = 0; i < toConvert.length(); i++) {
			if (toConvert.charAt(i) == '8' || toConvert.charAt(i) == '9') {
				toConvert = toConvert.substring(0,i);
			}
		}
		Double Octal = 0.0;
		int startValue = toConvert.length() - 1;
		
		for (int i = 0; i < toConvert.length(); i++) {
			Octal += Double.parseDouble(toConvert.substring(i, i + 1))
					* Math.pow(8, startValue - (i));
		}

		return Octal;
	}

}

package proccess;

import java.util.Scanner;

public class SRPN {

	public static void main(String[] args) {
		Stack stack = new Stack();
		Inputter inputter = new Inputter(stack);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while (true) {
			inputter.sortInput(in.nextLine());
		}
	}
}
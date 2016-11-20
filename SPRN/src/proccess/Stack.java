package proccess;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Stack {
	DecimalFormat format = new DecimalFormat("#.0");
	private ArrayList<Double> stack;

	public Stack() {
		// TODO Auto-generated constructor stub
		stack = new ArrayList<Double>();

	}

	public void push(double toAdd) {
		stack.add(toAdd);
	}

	public double pop() {
		double toPop = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);

		return toPop;
	}

	public void peekAll() {
		for (int i = 0; i < stack.size(); i++) {
			double toPrint = stack.get(i);
			if (toPrint % 1 != 0) {
				System.out.println(toPrint);
			} else
				System.out.println((int)toPrint);
		}
	}

	public void peekTop() {
		double toPrint = stack.get(stack.size() - 1);
		if (toPrint % 1 != 1) {
			System.out.println(toPrint);
		} else
			System.out.println((int)toPrint);
	}
}

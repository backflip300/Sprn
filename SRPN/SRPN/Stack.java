

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Stack {
	DecimalFormat format = new DecimalFormat("#");
	private ArrayList<Integer> stack;
	int maxSize = 23;
	public Stack() {
		// TODO Auto-generated constructor stub
		stack = new ArrayList<Integer>();

	}

	public void push(double toAdd) {
		if(toAdd > 2147483647){
			toAdd = 2147483647;
		}else if(toAdd < -2147483647){
			toAdd = -2147483647;
		}
		stack.add((int)toAdd);
	}

	public double pop() {
		double toPop = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);

		return toPop;
	}

	public void peekAll() {
		for (int i = 0; i < stack.size(); i++) {
			int toPrint = stack.get(i);
				System.out.println(toPrint);
		}
	}

	public void peekTop() {
		int toPrint = stack.get(stack.size() - 1);
			System.out.println(toPrint);
	}
	
	public boolean checkUnderflow(int toRemove){
		if (toRemove>stack.size()){
			System.err.println("Stack underflow.");
			return true;
		}
		return false;
	}
	public boolean checkOverflow(int toAdd){
		if(toAdd + stack.size() > maxSize){
			System.err.println("Stack overflow.");
			return true;
		}
		return false;
	}
}

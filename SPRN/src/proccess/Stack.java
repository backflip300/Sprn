package proccess;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<Double> stack;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		stack = new ArrayList<Double>();
		
	}
	
	
	public void push(double toAdd){
		stack.add(toAdd);
	}
	
	public double pop(){
		double toPop = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		
		return toPop;
	}
	
	public void peekAll(){
		for(int i =0;i<stack.size();i++){
			System.out.println(stack.get(i));
		}
	}
	public void peekTop(){
		System.out.println(stack.get(stack.size()-1));
	}
}

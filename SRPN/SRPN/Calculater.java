

public class Calculater {
	Stack stack;
	
	public Calculater(Stack stack) {
		this.stack = stack;
		
	}
	
	public void divide(){
		double denominator = stack.pop();
		double numerator = stack.pop();
		stack.push(numerator/denominator);
	}
	public void Multiply(){
		stack.push(stack.pop()*stack.pop());
	}
	public void Add(){
		stack.push(stack.pop()+stack.pop());
	}
	public void Subtract(){
		stack.push(stack.pop()-stack.pop());
	}
	public void Power(){
		stack.push(Math.pow(stack.pop(), stack.pop()));;
	}
}

package ASTPack;

public class Variable implements ASTNode {

	String id;
	
	public Variable(String id) {
		super();
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Variable (" + id + ")");

	}

}

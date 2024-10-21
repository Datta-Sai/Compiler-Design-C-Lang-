package ASTPack;

public class FunctionCall2 implements ASTNode {

	String id;
	
	public FunctionCall2(String id) {
		super();
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("( "+id+"()  )");

	}

}

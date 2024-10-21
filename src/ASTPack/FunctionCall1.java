package ASTPack;

public class FunctionCall1 implements ASTNode {

	String id;
	ASTNode t1;
	
	public FunctionCall1(String id, ASTNode t1) {
		super();
		this.id = id;
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("("+id +"(");
		t1.print();
		System.out.println(" )  )");

	}

}

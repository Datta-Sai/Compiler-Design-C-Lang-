package ASTPack;

public class FunctionCall implements ASTNode {

	ASTNode t1;

	public FunctionCall(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new FunctionCall (");
		t1.print();
		System.out.println(")");

	}

}

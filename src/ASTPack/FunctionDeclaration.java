package ASTPack;

public class FunctionDeclaration implements ASTNode {
ASTNode t1;

	public FunctionDeclaration(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new FunctionDeclaration (");
		t1.print();
		System.out.println(")");

	}

}

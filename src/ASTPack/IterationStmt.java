package ASTPack;

public class IterationStmt implements ASTNode {

	ASTNode t1;


	public IterationStmt(ASTNode t1) {
	super();
	this.t1 = t1;
}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new IterationStatement (");
		t1.print();
		System.out.println(")");

	}

}

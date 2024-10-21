package ASTPack;

public class CompoundStmt1 extends Allcompoundabstract implements ASTNode {
	ASTNode t1;


	public CompoundStmt1(ASTNode t1) {
	super();
	this.t1 = t1;
}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new CompoundStatement (");
		t1.print();
		System.out.println(")");

	}

}

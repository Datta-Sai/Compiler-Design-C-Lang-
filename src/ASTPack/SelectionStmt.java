package ASTPack;

public class SelectionStmt implements ASTNode {

	ASTNode t1;


	public SelectionStmt(ASTNode t1) {
	super();
	this.t1 = t1;
}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new SelectionStatement (");
		t1.print();
		System.out.println(")");

	}

}

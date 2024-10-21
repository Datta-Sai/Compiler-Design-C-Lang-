package ASTPack;

public class CompoundStmt extends Allcompoundabstract implements ASTNode {
ASTNode t1;

	public CompoundStmt(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new CompoundStmt (");
		System.out.println("{");
		t1.print();
		System.out.println("}");
		System.out.println(")");
	}

}

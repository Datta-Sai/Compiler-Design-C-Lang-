package ASTPack;

public class JumpStmt extends Alljumpabst implements ASTNode {

	ASTNode t1;


	public JumpStmt(ASTNode t1) {
	super();
	this.t1 = t1;
}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new JumpStatement (");
		t1.print();
		System.out.println(")");

	}

}
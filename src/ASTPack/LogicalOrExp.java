package ASTPack;

public class LogicalOrExp implements ASTNode {

	ASTNode t1;

	public LogicalOrExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new logicalOrExp (");
		t1.print();
		System.out.println(")");

	}

}

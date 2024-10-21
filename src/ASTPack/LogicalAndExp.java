package ASTPack;

public class LogicalAndExp implements ASTNode {

	ASTNode t1;

	public LogicalAndExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new LogicalAndExp (");
		t1.print();
		System.out.println(")");

	}

}

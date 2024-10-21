package ASTPack;

public class ExpStatement implements ASTNode {
ASTNode t1;


	public ExpStatement(ASTNode t1) {
	super();
	this.t1 = t1;
}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ExpStatement (");
		t1.print();
		System.out.println(")");

	}

}

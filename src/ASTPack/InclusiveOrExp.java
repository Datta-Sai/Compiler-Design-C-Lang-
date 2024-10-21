package ASTPack;

public class InclusiveOrExp implements ASTNode {

	ASTNode t1;

	public InclusiveOrExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new InclusiveOrExp (");
		t1.print();
		System.out.println(")");

	}

}

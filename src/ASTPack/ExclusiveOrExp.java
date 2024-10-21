package ASTPack;

public class ExclusiveOrExp implements ASTNode {

	ASTNode t1;

	public ExclusiveOrExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ExclusiveOrExp (");
		t1.print();
		System.out.println(")");

	}

}

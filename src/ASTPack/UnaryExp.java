package ASTPack;

public class UnaryExp implements ASTNode {

	ASTNode t1;

	public UnaryExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new UnaryExp (");
		t1.print();
		System.out.println(")");

	}

}

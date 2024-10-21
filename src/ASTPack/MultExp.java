package ASTPack;

public class MultExp implements ASTNode {

	ASTNode t1;

	public MultExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new MultExp (");
		t1.print();
		System.out.println(")");

	}

}

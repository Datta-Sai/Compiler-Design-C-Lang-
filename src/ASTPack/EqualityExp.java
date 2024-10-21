package ASTPack;

public class EqualityExp implements ASTNode {

	ASTNode t1;

	public EqualityExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new EqualityExp (");
		t1.print();
		System.out.println(")");

	}

}
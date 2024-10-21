package ASTPack;

public class ExpStatement1 implements ASTNode {
ASTNode t1;

	public ExpStatement1(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Exp Statement (");
		t1.print();
		System.out.println(";");
		System.out.println(")");

	}

}

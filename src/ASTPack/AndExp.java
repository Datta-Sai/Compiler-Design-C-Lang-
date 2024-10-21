package ASTPack;

public class AndExp implements ASTNode {

	ASTNode t1;

	public AndExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new AndExp (");
		t1.print();
		System.out.println(")");

	}

}
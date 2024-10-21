package ASTPack;

public class ShiftExp implements ASTNode {

	ASTNode t1;

	public ShiftExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ShiftExp (");
		t1.print();
		System.out.println(")");

	}

}

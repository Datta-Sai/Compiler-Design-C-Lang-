package ASTPack;

public class AssignExp implements ASTNode {
ASTNode t1;

	public AssignExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new AssignmentExp (");
		t1.print();
		System.out.println(")");

	}

}

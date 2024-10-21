package ASTPack;

public class Parameterlist implements ASTNode {
ASTNode t1, t2;

	public Parameterlist(ASTNode t1, ASTNode t2) {
	super();
	this.t1 = t1;
	this.t2 = t2;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ParameterList (");
		t1.print();
		System.out.println(",");
		t2.print();
		System.out.println(")");

	}

}

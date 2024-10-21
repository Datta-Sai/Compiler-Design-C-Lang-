package ASTPack;

public class SingleParameter implements ASTNode {
ASTNode t1;
	public SingleParameter(ASTNode t1) {
	super();
	this.t1 = t1;
}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new SingleParameter (");
		t1.print();
		System.out.println(")");

	}

}

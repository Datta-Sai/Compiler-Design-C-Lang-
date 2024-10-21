package ASTPack;

public class ConditionalExp implements ASTNode {

	ASTNode t1;

	public ConditionalExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ConditionalExp (");
		t1.print();
		System.out.println(")");

	}

}

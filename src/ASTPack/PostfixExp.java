package ASTPack;

public class PostfixExp extends Allpostfixabst implements ASTNode {

	ASTNode t1;

	public PostfixExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new PostfixExp (");
		t1.print();
		System.out.println(")");

	}

}

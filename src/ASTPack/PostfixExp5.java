package ASTPack;

public class PostfixExp5 extends Allpostfixabst implements ASTNode {

	ASTNode t1;

	public PostfixExp5(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new PostfixExp (");
		System.out.println("++");
		t1.print();
		System.out.println(")");

	}

}

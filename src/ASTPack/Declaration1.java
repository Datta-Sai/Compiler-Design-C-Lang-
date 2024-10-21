package ASTPack;

public class Declaration1 implements ASTNode {
ASTNode t1;

	public Declaration1(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		System.out.println("new Declaration1(");
		t1.print();
		System.out.println(")");

	}

}

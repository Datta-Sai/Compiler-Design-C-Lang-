package ASTPack;

public class PrimaryExp4 extends Allprimaryabst implements ASTNode {

	ASTNode t1;

	public PrimaryExp4(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new PrimaryExp (");
		t1.print();
		System.out.println("++ )");

	}

}


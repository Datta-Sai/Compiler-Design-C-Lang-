package ASTPack;

public class AdditiveExp implements ASTNode {

	ASTNode t1;

	public AdditiveExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new AdditiveExp (");
		t1.print();
		System.out.println(")");

	}

}
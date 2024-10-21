package ASTPack;

public class RelationalExp implements ASTNode {

	ASTNode t1;

	public RelationalExp(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new RelationalExp (");
		t1.print();
		System.out.println(")");

	}

}


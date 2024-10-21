package ASTPack;

public class SingleParametertail implements ASTNode {
ASTNode t1;

	public SingleParametertail(ASTNode t1) {
	super();
	this.t1 = t1;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new SingleParametertail (");
		System.out.println(", ");
		t1.print();
		System.out.println(")");
		

	}

}

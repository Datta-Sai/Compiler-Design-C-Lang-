package ASTPack;

public class ArgumentList implements ASTNode {

	ASTNode t1, t2;
	
	
	public ArgumentList(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Arguments (");
		t1.print();
		System.out.println(",");
		t2.print();
		System.out.println(")");

	}

}

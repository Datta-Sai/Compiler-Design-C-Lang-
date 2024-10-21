package ASTPack;

public class Mult_UnaryExp1 implements ASTNode {

	ASTNode t1,t2;

	public Mult_UnaryExp1(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Mult_UnaryExp (");
		t1.print();
		System.out.println("/");
		t2.print();
		System.out.println(")");

	}

}

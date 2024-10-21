package ASTPack;

public class Relational_shiftExp extends AllRelationalabst implements ASTNode {

	ASTNode t1,t2;

	public Relational_shiftExp(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Relational_shiftExp (");
		t1.print();
		System.out.println("<");
		t2.print();
		System.out.println(")");

	}

}


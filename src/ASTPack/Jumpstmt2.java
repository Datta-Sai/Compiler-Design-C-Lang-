package ASTPack;

public class Jumpstmt2 extends Alljumpabst implements ASTNode {
	ASTNode t1;
	

	public Jumpstmt2(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new JumpStmt (");
		System.out.println("return ");
		t1.print();
		System.out.println("; )");

	}

}

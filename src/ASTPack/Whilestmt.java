package ASTPack;

public class Whilestmt implements ASTNode {

	ASTNode t1, t2;
	
	public Whilestmt(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new WhileStmt (");
		System.out.println("while (");
		t1.print();
		System.out.println(")");
		t2.print();
		System.out.println(" )");
	}

}

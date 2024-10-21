package ASTPack;

public class LogicalOr_AndExp implements ASTNode {

	ASTNode t1,t2;

	public LogicalOr_AndExp(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new LogicalOr_AndExp (");
		t1.print();
		System.out.println("||");
		t2.print();
		System.out.println(")");

	}

}

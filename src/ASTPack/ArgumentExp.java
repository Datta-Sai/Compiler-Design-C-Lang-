package ASTPack;

public class ArgumentExp implements ASTNode {

	ASTNode t1;
	
	public ArgumentExp(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("( , ");
		t1.print();
		System.out.println(" )");

	}

}

package ASTPack;

public class FuncDec1 implements ASTNode {

	ASTNode t1;
	
	public FuncDec1(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" new Func Dec ( ");
		t1.print();
		System.out.println(" )");

	}

}

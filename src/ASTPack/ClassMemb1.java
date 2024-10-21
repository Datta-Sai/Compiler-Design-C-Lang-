package ASTPack;

public class ClassMemb1 implements ASTNode {

	ASTNode t1;
	
	
	public ClassMemb1(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Class Memb ( ");
		t1.print();
		System.out.println(" )");

	}

}

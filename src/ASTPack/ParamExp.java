package ASTPack;

public class ParamExp implements ASTNode {

	ASTNode t1;
	
	public ParamExp(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Parameter Exp(  (");
		t1.print();
		System.out.println(")  )");

	}

}

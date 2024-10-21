package ASTPack;

public class FunctionDecExp implements ASTNode {
Integer op;
String id;
ASTNode t2, t3;

	public FunctionDecExp(Integer op, String id, ASTNode t2, ASTNode t3) {
	super();
	this.op = op;
	this.id = id;
	this.t2 = t2;
	this.t3 = t3;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (op != null) {
		
		System.out.println("new FunctionDecExp(");
		switch(op)
		{
		case 1: System.out.println("INT, ");
				break;
		case 2: System.out.println("FLOAT, ");
				break;
		case 3: System.out.println("DOUBLE, ");
				break;
		case 4: System.out.println("CHAR, ");
				break;
		case 5: System.out.println("BOOL, ");
				break;
		case 6: System.out.println("ID, ");
				break;
		}
		System.out.println(","+ " "+ id + ", (");
		t2.print();
		System.out.println(") ,");
		t3.print();
		System.out.println(")");
		}else {
			System.out.println(" ");
		}
	
	}

}

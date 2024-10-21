package ASTPack;

public class FuncDecnoParam implements ASTNode {
Integer op;
String id;
ASTNode t1;
	public FuncDecnoParam(Integer op, String id, ASTNode t1) {
	super();
	this.op = op;
	this.id = id;
	this.t1 = t1;
}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (op != null) {
		System.out.println("new FuncDecwithnoParam (");
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
		System.out.println(" "+id+"()");
		t1.print();
		System.out.println(")");
		}else {
			System.out.println(" ");
		}


	}

}

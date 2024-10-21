package ASTPack;

public class OutputStmt implements ASTNode {
String stringl;
	public OutputStmt(String stringl) {
		super();
		this.stringl = stringl;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new OutputStatement (");
		System.out.println(" cout << ");
		System.out.println(stringl + ";");
		System.out.println(")");

	}

}

package ASTPack;

public class InputStmt implements ASTNode {
String id;

	public InputStmt(String id) {
	super();
	this.id = id;
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Input Statement (");
		System.out.println("cin >> ");
		System.out.println(id + ";");
		System.out.println(")");

	}

}

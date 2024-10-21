package ASTPack;

public class PrimaryExp2 extends Allprimaryabst implements ASTNode {

	ASTNode t1;
	String id;
	
	public PrimaryExp2(ASTNode t1, String id) {
		super();
		this.t1 = t1;
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new PrimaryExp (");
		t1.print();
		System.out.println(". " + id +" )");

	}

}

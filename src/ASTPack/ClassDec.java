package ASTPack;

public class ClassDec implements ASTNode {

	String id;
	ASTNode t1;
	
	public ClassDec(String id, ASTNode t1) {
		super();
		this.id = id;
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Class Dec ( ");
		System.out.println("class " + id + "{");
		t1.print();
		System.out.println("}  )");

	}

}

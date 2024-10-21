package ASTPack;

public class Floating implements ASTNode {

	Float num;
	
	public Floating(Float num) {
		super();
		this.num = num;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Floatvalue ( " + num + " )");

	}

}

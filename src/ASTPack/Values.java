package ASTPack;

public class Values implements ASTNode {

	Integer num;
	
	public Values(Integer num) {
		super();
		this.num = num;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Integer ( " + num + " )");

	}

}

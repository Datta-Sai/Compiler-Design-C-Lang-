package ASTPack;

public class Strings implements ASTNode {

	String id;
	
	public Strings(String id) {
		super();
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (id.equals("true")) {
			System.out.println("new Bool (" + id + ")");}
		else if ( id.equals("false")) {
			System.out.println("new Bool (" + id + ")");
		}
		if (id.length()>1) {
			System.out.println("new String ( " + id + ")");}
		else {
			System.out.println("new Char ( " + id + ")");
		}

	}

}

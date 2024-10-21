package ASTPack;

public class MembDec1 implements ASTNode {

	Integer op;
	String id;
	Integer num;
	
	
	public MembDec1(Integer op, String id, Integer num) {
		super();
		this.op = op;
		this.id = id;
		this.num= num;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (op != null) {
		System.out.println("new Memb Dec ( ");
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
		System.out.println(id + "{" + num +"} ;" );
		System.out.println(" )");
		}else {
			System.out.println(" ");
		}

	}
}

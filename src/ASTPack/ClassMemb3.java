package ASTPack;

public class ClassMemb3 implements ASTNode {

	Integer op;
	ASTNode t1;
	
	public ClassMemb3(Integer op, ASTNode t1) {
		super();
		this.op = op;
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (op != null) {
		System.out.println("new Class Memb (");
		switch(op)
		{
		case 1: System.out.println("private :, ");
				break;
		case 2: System.out.println("protected:, ");
				break;
		case 3: System.out.println("public:, ");
				break;
		}
		System.out.println(",");
		t1.print();
		System.out.println(" )");
		}else {
			System.out.println(" ");
		}


	}

}

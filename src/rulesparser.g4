grammar rulesparser;

options {
  tokenVocab = lexical_analysis;
}
@header

{
	import ASTPack.*;
}

@members
{
Hashtable<String, String> hashTable = new Hashtable<String, String>();

public void printHT()
{
	System.out.println("\nHashTable: ");
	Enumeration names;
	String key;
	names = hashTable.keys();
	while(names.hasMoreElements()) {
		key = (String) names.nextElement();
		System.out.println("Key: " +key+ " & Value: " + hashTable.get(key));
	}
}
}
program returns [ASTNode node]:t1=declarationList {$node=$t1.node;$node.print(); printHT();};
declarationList returns [ASTNode node]:t1=declaration t2=declarationList {$node=new Declaration($t1.node, $t2.node);}
     					| t3=declaration {$node=new Declaration1($t3.node);}
     					| t5 = classDeclaration t6=declarationList {$node=new Declaration($t5.node, $t6.node);}
     					|t4= classDeclaration {$node = new Declaration1($t4.node);};

declaration returns [ASTNode node]: t1=typeSpecifier ID SEMICOLON {$node=new SingleDeclaration($t1.val, $ID.text);}
						| t2=typeSpecifier ID1 SEMICOLON  {$node=new ArrayDeclaration($t2.val, $ID1.text);}
						| t3=functionDeclaration {$node= new FunctionDeclaration($t3.node);};
functionDeclaration returns [ASTNode node, String funtype]:  t4=typeSpecifier ID LCBRACKET RCBRACKET t5=compoundStatement {$node=new FuncDecnoParam($t4.val, $ID.text, $t5.node);{$funtype = "Function";};if($t4.val == 1) {hashTable.put("Integer", $funtype);}else if($t4.val ==2) {hashTable.put("Float", $funtype);}else if($t4.val ==3) {hashTable.put("Double", $funtype);}else if($t4.val ==4) {hashTable.put("char", $funtype);}else if($t4.val ==5) {hashTable.put("Bool", $funtype);} else if($t4.val ==6) {hashTable.put("String", $funtype);} else if($t4.val ==7) {hashTable.put("Void", $funtype);};}
						|t1=typeSpecifier ID LCBRACKET t2=parameterList RCBRACKET t3=compoundStatement {$node=new FunctionDecExp($t1.val, $ID.text, $t2.node, $t3.node);};

parameterList returns [ASTNode node]: t1=parameter t2=parameterTail {$node=new Parameterlist($t1.node, $t2.node);}
						| t3=parameter {$node=new SingleParameter($t3.node);}; 

parameterTail returns [ASTNode node]: COMMA t1=parameter t2=parameterTail {$node=new ParameterTail($t1.node, $t2.node);}
						| COMMA t3=parameter{$node=new SingleParametertail($t3.node);};

parameter returns [ASTNode node]: t1=typeSpecifier ID {$node=new Parameterexp($t1.val, $ID.text);}
          		    	| t2=typeSpecifier ID LSQBRACKET RSQBRACKET {$node=new ArrayParameterExp($t2.val, $ID.text);}
          		    	| t3=statement {$node=new ExpStatement($t3.node);}
          		    	| t4=typeSpecifier{$node=new TypeSpecifier($t4.val);};
compoundStatement returns [ASTNode node]: LBRACKET t1=statementList RBRACKET {$node=new CompoundStmt($t1.node);}
						|  LBRACKET RBRACKET {$node=new CodeSection();}
						|SEMICOLON {$node=new Semicolon();};

statementList returns [ASTNode node]: t1=statement t2=statementList {$node=new Statementlist($t1.node, $t2.node);}
             			| t3=statement {$node=new ExpStatement($t3.node);}
             			| t4=declaration t5=statementList {$node=new DecwithStmt($t4.node, $t5.node);}
             			| {$node=new NullStmt();};

statement returns [ASTNode node]: t1=expressionStatement {$node=new ExpStatement($t1.node);}
          				| t2=compoundStatement {$node=new CompoundStmt1($t2.node);}
          				| t3=selectionStatement {$node=new SelectionStmt($t3.node);}
          				| t4=iterationStatement {$node=new IterationStmt($t4.node);}
          				| t5=jumpStatement {$node=new JumpStmt($t5.node);}
          				|COUT LSHIFT STRINGL SEMICOLON {$node=new OutputStmt($STRINGL.text);}
          				|CIN RSHIFT ID SEMICOLON {$node=new InputStmt($ID.text);};

expressionStatement returns [ASTNode node] : t1=expression {$node=new ExpStatement($t1.node);}
						|t2=expression SEMICOLON {$node=new ExpStatement1($t2.node);}
                  		| SEMICOLON {$node=new Semicolon();};

expression returns [ASTNode node]: t1=assignmentExpression {$node=new AssignExp($t1.node);}
           				| t2= expression COMMA t3= assignmentExpression {$node=new ExpAndAssignExp($t2.node, $t3.node);};

assignmentExpression returns [ASTNode node, String funtype]: t1=conditionalExpression {$node=new ConditionalExp($t1.node);$funtype = $t1.funtype;}
                   	 	| t2=unaryExpression ASSIGNMENT t3=assignmentExpression {$node=new UnaryAndAssignExp($t2.node, $t3.node); if($t3.funtype != null) {hashTable.put($t2.funtype, $t3.funtype);};};

conditionalExpression returns [ASTNode node, String funtype]: t1=logicalOrExpression {$node=new LogicalOrExp($t1.node);$funtype = $t1.funtype;}
						| t2=logicalOrExpression TERNARY t3= expression TERNARY t4= conditionalExpression {$node=new TernaryExp($t2.node, $t3.node, $t4.node);};

logicalOrExpression returns [ASTNode node, String funtype]: t1=logicalAndExpression {$node=new LogicalAndExp($t1.node);$funtype = $t1.funtype;}
                 		| t2=logicalOrExpression LOR t3=logicalAndExpression {$node=new LogicalOr_AndExp($t2.node, $t3.node);};
						
logicalAndExpression returns [ASTNode node, String funtype]: t1=inclusiveOrExpression {$node=new InclusiveOrExp($t1.node);$funtype = $t1.funtype;}
                  		| t2= logicalAndExpression LAND t3= inclusiveOrExpression {$node=new LogicalAnd_inclusiveOrExp($t2.node, $t3.node);};

inclusiveOrExpression returns [ASTNode node, String funtype]: t1=exclusiveOrExpression {$node=new ExclusiveOrExp($t1.node);$funtype = $t1.funtype;}
                   		| t2=inclusiveOrExpression BOR t3=exclusiveOrExpression {$node=new InclusiveOr_ExclusiveOrExp($t2.node, $t3.node);String lType;String rType;if($t2.funtype==null){lType="null";}else{lType=hashTable.get($t2.funtype);}if($t3.funtype==null){rType="null";}else{rType=hashTable.get($t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};};

exclusiveOrExpression returns [ASTNode node, String funtype]: t1= andExpression {$node=new AndExp($t1.node);$funtype = $t1.funtype;}
                    	| t2= exclusiveOrExpression BXOR t3= andExpression {$node=new ExclusiveOr_AndExp($t2.node, $t3.node);String lType;String rType;if($t2.funtype==null){lType="null";}else{lType=hashTable.get($t2.funtype);}if($t3.funtype==null){rType="null";}else{rType=hashTable.get($t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};};

andExpression returns [ASTNode node, String funtype]: t1=equalityExpression {$node=new EqualityExp($t1.node);$funtype = $t1.funtype;}
             	 		| t2= andExpression BAND t3 =equalityExpression {$node=new And_EqualityExp($t2.node, $t3.node);String lType;String rType;if($t2.funtype==null){lType="null";}else{lType=hashTable.get($t2.funtype);}if($t3.funtype==null){rType="null";}else{rType=hashTable.get($t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};};

equalityExpression returns [ASTNode node, String funtype]: t1=relationalExpression {$node=new RelationalExp($t1.node);$funtype = $t1.funtype;}
                		| t2=equalityExpression EQ t3=relationalExpression {$node=new Equality_relationalExp($t2.node, $t3.node); String lType;String rType;if($t2.funtype==null){lType="null";}else{lType=hashTable.get($t2.funtype);}if($t3.funtype==null){rType="null";}else{rType=hashTable.get($t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};}
                		| t4=equalityExpression NE t5=relationalExpression {$node=new Equality_relationalExp1($t4.node, $t5.node); String lType;String rType;if($t4.funtype==null){lType="null";}else{lType=hashTable.get($t4.funtype);}if($t5.funtype==null){rType="null";}else{rType=hashTable.get($t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};};
relationalExpression returns [ASTNode node, String funtype]: t1=shiftExpression {$node=new ShiftExp($t1.node);$funtype = $t1.funtype;}
                   		| t2=relationalExpression LT t3=shiftExpression {$node=new Relational_shiftExp($t2.node, $t3.node);String lType;String rType;if($t2.funtype==null){lType="null";}else{lType=hashTable.get($t2.funtype);}if($t3.funtype==null){rType="null";}else{rType=hashTable.get($t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};}
                   		| t4=relationalExpression LE t5=shiftExpression {$node=new Relational_shiftExp1($t4.node, $t5.node);String lType;String rType;if($t4.funtype==null){lType="null";}else{lType=hashTable.get($t4.funtype);}if($t5.funtype==null){rType="null";}else{rType=hashTable.get($t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};}
                   		| t6=relationalExpression GT t7=shiftExpression {$node=new Relational_shiftExp2($t6.node, $t7.node);String lType;String rType;if($t6.funtype==null){lType="null";}else{lType=hashTable.get($t6.funtype);}if($t7.funtype==null){rType="null";}else{rType=hashTable.get($t7.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};}
                   		| t8=relationalExpression GE t9=shiftExpression {$node=new Relational_shiftExp3($t8.node, $t9.node);String lType;String rType;if($t8.funtype==null){lType="null";}else{lType=hashTable.get($t8.funtype);}if($t9.funtype==null){rType="null";}else{rType=hashTable.get($t9.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};};

shiftExpression returns [ASTNode node, String funtype]: t1=additiveExpression {$node=new AdditiveExp($t1.node);$funtype = $t1.funtype;}
               			| t2=shiftExpression LSHIFT t3=additiveExpression {$node=new Shift_additiveExp($t2.node, $t3.node);String lType;String rType;if($t2.funtype==null){lType="null";}else{lType=hashTable.get($t2.funtype);}if($t3.funtype==null){rType="null";}else{rType=hashTable.get($t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};}
               			| t4=shiftExpression RSHIFT t5=additiveExpression {$node=new Shift_additive1Exp($t4.node, $t5.node);String lType;String rType;if($t4.funtype==null){lType="null";}else{lType=hashTable.get($t4.funtype);}if($t5.funtype==null){rType="null";}else{rType=hashTable.get($t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};};
additiveExpression returns [ASTNode node, String funtype]: t1=multiplicativeExpression {$node=new MultExp($t1.node);$funtype = $t1.funtype;}
                 		| t2=additiveExpression ADD t3=multiplicativeExpression {$node=new Add_MultExp($t2.node, $t3.node);String lType;String rType;if($t2.funtype==null){lType="null";}else{lType=hashTable.get($t2.funtype);}if($t3.funtype==null){rType="null";}else{rType=hashTable.get($t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};}
                 		| t4=additiveExpression SUB t5=multiplicativeExpression {$node=new Add_MultExp1($t4.node, $t5.node);String lType;String rType;if($t4.funtype==null){lType="null";}else{lType=hashTable.get($t4.funtype);}if($t5.funtype==null){rType="null";}else{rType=hashTable.get($t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};};
multiplicativeExpression returns [ASTNode node, String funtype]: t1= unaryExpression {$node=new UnaryExp($t1.node);$funtype = $t1.funtype;}
                     	| t2= multiplicativeExpression MUL t3=unaryExpression {$node=new Mult_UnaryExp($t2.node, $t3.node);String lType;String rType;if($t2.funtype==null){lType="null";}else{lType=hashTable.get($t2.funtype);}if($t3.funtype==null){rType="null";}else{rType=hashTable.get($t3.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};}
                     	| t4=multiplicativeExpression DIV t5=unaryExpression {$node=new Mult_UnaryExp1($t4.node, $t5.node);String lType;String rType;if($t4.funtype==null){lType="null";}else{lType=hashTable.get($t4.funtype);}if($t5.funtype==null){rType="null";}else{rType=hashTable.get($t5.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){$funtype = lType;System.out.println("Type matched");}else{if(rType == null){System.out.println("Error dividing by 0");}else {System.out.println("Type mismatch between " + lType + " and " + rType);}};}
                     	| t6=multiplicativeExpression MOD t7=unaryExpression {$node=new Mult_UnaryExp2($t6.node, $t7.node);String lType;String rType;if($t6.funtype==null){lType="null";}else{lType=hashTable.get($t6.funtype);}if($t7.funtype==null){rType="null";}else{rType=hashTable.get($t7.funtype);}printHT();if(lType == null){System.out.println("left Variable "  + " not declared");}if(rType == null){System.out.println("right Variable " + " not declared");}if(lType == rType || (lType=="Float" && rType=="Integer")||(rType=="Float" && lType=="Integer")){$funtype = lType;System.out.println("Type matched");}else{System.out.println("Type mismatch between " + lType + " and " + rType);};};
unaryExpression returns [ASTNode node, String funtype]: t1=postfixExpression {$node=new PostfixExp($t1.node);$funtype = $t1.funtype;}
               			| ADD t2=unaryExpression {$node=new PostfixExp1($t2.node);}
               			| SUB t3=unaryExpression {$node=new PostfixExp2($t3.node);}
               			| LNOT t4=unaryExpression {$node=new PostfixExp3($t4.node);}
               			| BCOMP t5=unaryExpression {$node=new PostfixExp4($t5.node);}
               			| INCREMENT t6=unaryExpression {$node=new PostfixExp5($t6.node);}
               			| DECREMENT t7=unaryExpression {$node=new PostfixExp6($t7.node);}; 
postfixExpression returns [ASTNode node, String funtype]: t1=primaryExpression {$node=new PrimaryExp($t1.node);$funtype = $t1.funtype;}
                 		| t2=postfixExpression LSQBRACKET t8=expression RSQBRACKET {$node=new PrimaryExp1($t2.node, $t8.node);}
                 		| t3=postfixExpression DOT ID {$node=new PrimaryExp2($t3.node, $ID.text);}
                 		| t4=postfixExpression ARROW ID {$node=new PrimaryExp3($t4.node, $ID.text);}
                 		| t5=postfixExpression INCREMENT {$node=new PrimaryExp4($t5.node);}
                 		| t6=postfixExpression DECREMENT {$node=new PrimaryExp5($t6.node);}
                 		| t7=functionCall {$node=new FunctionCall($t7.node);};
primaryExpression returns [ASTNode node, String funtype]: ID {$node=new Variable($ID.text); $funtype = $ID.text;}
						|ID1 {$node=new Variable($ID1.text); $funtype = "Array";}
                		| INTEGER {$node= new Values(Integer.parseInt($INTEGER.text)); $funtype = "Integer";}
                		| FLOATING {$node= new Floating(Float.parseFloat($FLOATING.text)); $funtype = "Float";}
                		| STRINGL {$node=new Strings($STRINGL.text); $funtype = "String";}
                		| CHAR_LITERAL {$node=new Strings($CHAR_LITERAL.text); $funtype = "Char";}
                		| TRUE {$node=new Strings($TRUE.text); $funtype = "Bool";}
                		| FALSE {$node=new Strings($FALSE.text); $funtype = "Bool";}
                		| LCBRACKET t1= expression RCBRACKET {$node=new ParamExp($t1.node);};
functionCall returns [ASTNode node]	: ID LCBRACKET t1=argumentList RCBRACKET {$node=new FunctionCall1($ID.text,$t1.node);}
						| ID LCBRACKET RCBRACKET {$node=new FunctionCall2($ID.text);};

argumentList returns [ASTNode node]	: t1=assignmentExpression t2=argumentTail {$node=new ArgumentList($t1.node, $t2.node);}
						| t3=assignmentExpression {$node=new AssignExp($t3.node);}
             			;

argumentTail returns [ASTNode node]	: COMMA t1= assignmentExpression t2= argumentTail {$node=new ArgumentTail($t1.node, $t2.node);}
             			| COMMA t3= assignmentExpression {$node=new ArgumentExp($t3.node);};
selectionStatement returns [ASTNode node]: IF LCBRACKET t1= expression RCBRACKET t2=statement {$node=new Ifstmt($t1.node, $t2.node);}
                  		| IF LCBRACKET t3=expression RCBRACKET t4=statement ELSE t5=statement {$node=new Ifstmt1($t3.node, $t4.node, $t5.node);};
iterationStatement returns [ASTNode node]: WHILE LCBRACKET t1= expression RCBRACKET t2= statement  {$node=new Whilestmt($t1.node, $t2.node);}
						| FOR LCBRACKET t3=expressionStatement t4=expressionStatement t5=expression RCBRACKET t6=statement  {$node=new Forstmt($t3.node, $t4.node, $t5.node, $t6.node);};
jumpStatement returns [ASTNode node]: RETURN SEMICOLON {$node=new Jumpstmt1();}
						| RETURN t1=functionCall SEMICOLON {$node=new Jumpstmt2($t1.node);}
						| RETURN t2=functionCall t3=expression SEMICOLON {$node=new Jumpstmt3($t2.node,$t3.node);}
              			| RETURN t4=expression SEMICOLON {$node=new Jumpstmt4($t4.node);}
              			| BREAK SEMICOLON {$node=new Jumpstmt5();}
              			| CONTINUE SEMICOLON {$node=new Jumpstmt6();};
              			
//Class
classDeclaration returns [ASTNode node] : CLASS ID LBRACKET t1=classMembers RBRACKET {$node=new ClassDec($ID.text,$t1.node);};


classMembers returns [ASTNode node]	: t1=classMember t2=classMembers {$node=new ClassMemb($t1.node,$t2.node);}
             			| t3=classMember {$node=new ClassMemb1($t3.node);};

classMember returns [ASTNode node]	: t1=accessSpecifier t2=memberDeclaration {$node=new ClassMemb3($t1.val,$t2.node);};

accessSpecifier returns [Integer val]: PRIVATE COLON {$val=1;}
                		| PROTECTED COLON {$val=2;}
                		| PUBLIC COLON {$val=3;};

memberDeclaration returns [ASTNode node]: t1 = typeSpecifier ID SEMICOLON {$node=new MembDec($t1.val,$ID.text);}
                 		| t2= typeSpecifier ID LSQBRACKET INTEGER RSQBRACKET SEMICOLON {$node=new MembDec1($t2.val,$ID.text,Integer.parseInt($INTEGER.text) );}
                 		| t3 = functionDeclaration1 {$node=new FuncDec1($t3.node);};

functionDeclaration1 returns [ASTNode node]	: t1 =typeSpecifier ID LBRACKET t2= parameterList RBRACKET SEMICOLON {$node=new FuncDec($t1.val,$ID.text, $t2.node);}
						|t3=typeSpecifier ID LBRACKET RBRACKET SEMICOLON {$node=new FuncDec2($t3.val,$ID.text);};


typeSpecifier returns [Integer val, String funtype]: INT {$val=1; $funtype = "Integer";}
              			| FLOAT {$val=2; $funtype = "Float";}
              			| DOUBLE {$val=3; $funtype = "Double";}
              			| CHAR {$val=4;$funtype = "Char";}
              			| BOOL {$val=5;$funtype = "Bool";}
              			| ID {$val=6;$funtype = "Variable";}
              			|VOID {$val=7;$funtype = "Void";}
              			|;
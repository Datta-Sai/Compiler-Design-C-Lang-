import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	public static void main(String[] args) throws IOException {
		ANTLRFileStream input = new ANTLRFileStream(args[0]);
        ANTLRInputStream ip = new ANTLRInputStream(input.toString());
        
        lexical_analysis lex = new lexical_analysis(ip);
        //Token token;
        
        CommonTokenStream tokStream = new CommonTokenStream(lex);
        rulesparserParser parser = new rulesparserParser(tokStream);
        parser.program();
	}
}
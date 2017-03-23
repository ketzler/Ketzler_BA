package OwnCode;

	import java.io.IOException;
import java.util.Scanner;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.tools.shell.Global;
import org.mozilla.javascript.tools.shell.ShellContextFactory;

	public class index {

		public static String ganzeDatei;
		public static String  thisLine;
		public static ShellContextFactory shellContextFactory = new ShellContextFactory();

		public static void main(String[] args) throws IOException, Exception, IllegalAccessException {
			// Scanner
			System.out.println("Enter sourceCode, complete with q! : ");
			Scanner scanner = new Scanner(System.in); 
			StringBuilder sb = new StringBuilder();
	        while (true){ 
	            String s = scanner.nextLine(); 
	            if(s.equals("q!")) break; 
	            sb.append(s);
	        } 
	        scanner.close(); 
	        String sourceCode = sb.toString();
			System.out.println(sourceCode);
			//###############################################
			
			//Context und Global/Scope erstellen
			Context cx = Context.enter();
			Global global = new Global(cx);
			
			Object result = cx.evaluateString(global, sourceCode, "<cmd>", 1, null);
			System.out.println("Result: "+cx.toString(result));
			Context.exit();
		}
}

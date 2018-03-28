import java.util.HashMap;

public class PatternMatcher {

	//String cmd = "[a]:[b]";
	
	HashMap<String,String> match(String txt, String pattern){
		
		HashMap<String,String> m = new HashMap<String,String>();
		
		char[] tarr = txt.toCharArray();
		
		String varName = "";
		String varVal = "";
		
		boolean start = false;
		boolean end = false;
		
		
		
		
		for(int i=0;i<tarr.length;i++){
			char c = tarr[i];
			
			if(c == '['){
				start = true;
				continue;
				
			}
			
			if(c == ']'){
				start = false;
				continue;
				
			}
			
			if(start){
				varName += c;
			}
			
			
			
		}
		
	return null;	
	}
}

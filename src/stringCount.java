import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class stringCount {

	String str1 = "i love piyush piyush";
	public void findDuplicateCharacter(String str){
		Map<Character,Integer> charmap = new HashMap<Character,Integer>();
		char[] chars =str1.toCharArray();
		for(Character ch : chars){
			if(charmap.containsKey(ch)){
				charmap.put(ch, charmap.get(ch)+1);
			}else{
				charmap.put(ch, 1);
			}
		}
		Set<Character> keys = charmap.keySet();
		for(Character ch : keys){
			if(charmap.get(ch)>1){
				System.out.println(ch+"--------------"+ charmap.get(ch));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringCount obj = new stringCount();
		obj.findDuplicateCharacter(obj.str1);
		
			
	}

}

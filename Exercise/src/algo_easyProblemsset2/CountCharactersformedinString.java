package algo_easyProblemsset2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CountCharactersformedinString {

	@Test
	public void test1()
	{
		String[] s ={"cat","bt","hat","tree"};
		String input= "atach";
		countCharacters(s,input);
	}
	
public int countCharacters(String[] words, String chars) {
		 			int res = 0;
			        int count[] = new int[26];
			        boolean flag = true;
		        
		        for(int i=0; i<chars.length(); i++)
		            count[chars.charAt(i) - 'a']++;
		        
		        for(int i=0; i<words.length; i++){
		            int temp[] = count.clone();
		            flag = true;
		            for(int j=0; j<words[i].length(); j++){
		                if(temp[words[i].charAt(j) - 'a']-- <= 0) {
		                    flag = false;
		                    break;
		                }
		            }
		            if(flag) res += words[i].length();
		        }
		        return res;
	    }
}

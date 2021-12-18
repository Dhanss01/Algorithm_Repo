package algo_easyProblemsset2;


import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class NiceSubstringwithLowerUpper {

	

		@Test
		public void example1() {
			String S = "azABaabza";
			System.out.println(solution(S));
		}
		
		@Test
		public void example2() {
			String S = "TacoCat";
			System.out.println(solution(S));
		}
		
		@Test
		public void example3() {
			String S = "AcZCbaBz";
			System.out.println(solution(S));
		}

		public int solution(String S) {
			for(int i=1;i<=S.length();i++){
				for(int j=0;j<S.length()-i+1;j++){
					Set<Character> lower = new HashSet<>();
					Set<Character> upper = new HashSet<>();
					String minBalanced = S.substring(j,j+i);
					char[] minChar = minBalanced.toCharArray();
					for(char ch : minChar){
						if(Character.isLowerCase(ch)) lower.add(ch);
						else upper.add(ch);
					}
					if(convertToLower(upper).containsAll(lower) && lower.containsAll(convertToLower(upper)))
						return minBalanced.length();
				}            
			}
			return -1;   
		}
		
		private Set<Character> convertToLower(Set<Character> set){
			Set<Character> lower = new HashSet<>();
			for (Character ch : set)
				lower.add(Character.toLowerCase(ch));
			return lower;
		}


	
	
}

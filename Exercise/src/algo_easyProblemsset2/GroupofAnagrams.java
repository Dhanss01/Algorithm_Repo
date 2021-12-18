package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupofAnagrams {

	@Test
	public void test1() {
		String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
		grouping(s);
	}

	private void grouping(String[] strs) {

		// {"eat","tea","tan","ate","nat","bat"};

		Map<Map<Character, Integer>, List<String>> resultmap = new HashMap<Map<Character, Integer>, List<String>>();

		for (String word : strs) {
			Map<Character, Integer> inputmap = new LinkedHashMap<Character, Integer>();
			for (int i = 0; i < word.length(); i++) {
				inputmap.put(word.charAt(i), inputmap.getOrDefault(word.charAt(i), 0) + 1);
			}

			if (resultmap.containsKey(inputmap)) {
				List<String> list = resultmap.get(inputmap);
				list.add(word);
				resultmap.put(inputmap, list);

			} else {
				List<String> groupList = new ArrayList<>(Arrays.asList(word));
				resultmap.put(inputmap, groupList);

			}

		}

		List<List<String>> resultList = new ArrayList<>(resultmap.values());
		System.out.println(resultList);

	}
	
	
	
	public List<List<String>> GetgroupofAnagrams(String[] s)
	{
		Map<Map<Character,Integer>, List<String>> result =new HashMap<Map<Character,Integer>,List<String>>();
		
		for(String word : s)
		{
			Map<Character, Integer> tempmap = new LinkedHashMap<Character,Integer>();
			
			for (int i = 0; i < word.length(); i++) {
				tempmap.put(word.charAt(i), tempmap.getOrDefault(word.charAt(i), 0) + 1);
			}
			if(result.containsKey(tempmap))
			{
				List<String> inputlist2 = result.get(tempmap);
				inputlist2.add(word);
				result.put(tempmap,inputlist2);
			}
			else
			{
				List<String> inputlist1= new ArrayList<String>(Arrays.asList(word));
				result.put(tempmap,inputlist1);
			}	
		}
		List<List<String>> resultlist = new ArrayList<List<String>>(result.values());
		return resultlist;
	}
	
	
	
	
	
	
	
	
	
	

	}

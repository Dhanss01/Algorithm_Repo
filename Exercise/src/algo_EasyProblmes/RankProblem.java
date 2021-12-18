package algo_EasyProblmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class RankProblem {
	
	@Test
	public void test() {
		int[] score = {5,4,3,2,1};
		findRelativeRanks(score);
		
		
	}
	
	 public String[] findRelativeRanks(int[] score)  {
		        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		        //int[] sortofScore= new int[score.length];
		        int[] sortofScore=Arrays.copyOf(score, score.length);
		        String[] output= new String[score.length];
		        Arrays.sort(sortofScore);
		        //Collections.sort
		        int rank=1;
		        for(int i=sortofScore.length-1;i>=0;i--) {
		        	map.put(sortofScore[i], rank);
		        	rank++;
		        }
		        for(int i=0;i<score.length;i++) {
		        	int r= score[i];
		        	if (map.get(r)==1)
		        	{
		        		output[i]= "Gold Medal";
		        	}
		        	else if(map.get(r)==2)
		        	{
		        		output[i]= "Silver Medal";
		        	}
		        	else if(map.get(r)==3)
		        	{
		        		output[i]= "Bronze Medal";
		        	}
		        	else{
		        		output[i]=String.valueOf(map.get(score[i]));
		        	}
		        }
		        
		        return output;
		    }
	 }
	


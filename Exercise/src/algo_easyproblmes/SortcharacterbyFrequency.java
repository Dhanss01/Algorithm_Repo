package algo_easyproblmes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import org.junit.Test;

public class SortcharacterbyFrequency {

	
	
	
	@Test
	public void test1() {
		 String s= "tree";
		 System.out.println(frequencySort(s));
	}
	
	class Pair{
        char k;
        int freq;
        Pair(char k, int freq){
            this.k=k;
            this.freq=freq;  
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer>map=new HashMap<>();
        char a[]=s.toCharArray();
        for(char c: a){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair>maxheap=new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair x, Pair y){
                return y.freq-x.freq;
            }
        });
       
        for(Entry<Character, Integer> entry: map.entrySet()){
            maxheap.add(new Pair(entry.getKey(), entry.getValue()));

        }
        StringBuilder sb=new StringBuilder();
        while(maxheap.size()!=0){
            Pair rem=maxheap.poll();
            char t=rem.k;
            int f=rem.freq;
            for(int i=0;i<f;i++){
                sb.append(t);
            }  
        }
        return sb.toString();     
        }

}

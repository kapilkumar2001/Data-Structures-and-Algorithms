// Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their
//  appearance in the original array. 



import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution T = new  Solution();
	        
	        List <List<String>> ans = T.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}


class Solution {
    
    boolean isanagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int count[] = new int[256];
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        
        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    
    public List<List<String>> Anagrams(String[] string_list) {
        
        List<List<String>> l = new ArrayList<List<String>>();
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0;i<string_list.length;i++)
        {
            if(hs.contains(i))
            {
                continue;
            }
            List<String> l1 = new ArrayList<String>();
            
            l1.add(string_list[i]);
            hs.add(i);
            
            for(int j=i+1;j<string_list.length;j++)
            {
                if(hs.contains(j))
                {
                    continue;
                }
                
                if(isanagram(string_list[i],string_list[j]))
                {
                    l1.add(string_list[j]);
                    hs.add(j);
                }
            }
            l.add(l1);
        }
        return l;
    }
}


/*Substrings with K Distinct
You are given a string s consisting of lowercase characters and an integer k, You have to count all possible substrings that have exactly k distinct characters.

Examples :

Input: s = "abc", k = 2
Output: 2
Explanation: Possible substrings are ["ab", "bc"]
Input: s = "aba", k = 2
Output: 3
Explanation: Possible substrings are ["ab", "ba", "aba"]
Input: s = "aa", k = 1
Output: 3
Explanation: Possible substrings are ["a", "a", "aa"]
Constraints:
1 ≤ s.size() ≤ 106
1 ≤ k ≤ 26

https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1

*/

import java.util.HashMap;

class Solution {
    public int countSubstr(String s, int k) 
    {
        int l=0,r=0, count=0;
        HashMap<Character, Integer> mpp=new HashMap<Character, Integer>();
    
        //using sliding window
        while(r<s.length())
        {
            char ch=s.charAt(r);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            
            if(mpp.size()<k)
            {
                r++;
            }else if(mpp.size()>k)
            {
                char valAtL=s.charAt(l);
                mpp.put(ch,mpp.get(ch)-1);
                if(mpp.get(valAtL)==0)
                {
                    mpp.remove(valAtL);
                }
                l++;
            }
            else {
                count++;
                r++;
            }
        }
        
        return count;
    }
}

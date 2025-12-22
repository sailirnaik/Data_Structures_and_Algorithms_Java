/*Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

https://leetcode.com/problems/valid-anagram/description/
*/

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
      char[] ss = s.toCharArray();
      char[] tt = t.toCharArray();

       Arrays.sort(ss);
       Arrays.sort(tt);
            
       for(int i=0; i<ss.length;i++){
            if(ss[i]!=tt[i]){
                return false;
            }
       }
       return true;
    }
}

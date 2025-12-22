/*Sort Characters By Frequency
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 

Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.

https://leetcode.com/problems/sort-characters-by-frequency/description/

*/

import java.util.*;

class Solution {
    public String frequencySort(String s) {
    
        //add each character in a map with count
        Map<Character,Integer> mpp=new HashMap<Character,Integer>();
        for(char ch :s.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);
        }

        //add each character in a list, since we want the rearrange it,
        //we will get access to more method to sort and all
        List<Character> chars=new ArrayList<Character>();
        for(char v :s.toCharArray()){
           chars.add(v);
        }

        //use compare method to sort the list
       //Collections.sort(chars, (a, b) -> mpp.get(b) - mpp.get(a));

//sorting can be done this way also to avoid the order of characters
  Collections.sort(chars, (a, b) -> {
            int freqCompare = mpp.get(b) - mpp.get(a);
            if (freqCompare == 0) {
                return a - b; // optional: for consistent order
            }
            return freqCompare;
        });



        //put it in stringbuilder as string is immutable
        StringBuilder sb=new StringBuilder();
        for (char c:chars){
            sb.append(c);
        }
        return sb.toString();
    }
}

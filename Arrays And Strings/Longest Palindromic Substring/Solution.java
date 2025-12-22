/*Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

https://leetcode.com/problems/longest-palindromic-substring/description/
*/

class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String lps="";

        for (int i=1; i<s.length();i++){

            //when the palindrome is odd ex:ABCBA
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if(low==-1 || high==s.length()){
                    break;
                }
            }
            String palindrome=s.substring(low+1,high);
            if(palindrome.length()>lps.length()){ lps=palindrome;}

            //when the palindrome is EVEN ex:ABBA
            low=i-1;
            high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if(low==-1 || high==s.length()){
                    break;
                }
            }
            palindrome=s.substring(low+1,high);
            if(palindrome.length()>lps.length()){ lps=palindrome;}
        }
        return lps;
    }
}

/*Sum of Digit is Palindrome or not

Given a number n. Return true if the digit sum(or sum of digits) of n is a Palindrome number otherwise false.

A Palindrome number is a number that stays the same when reversed

Examples:

Input: n = 56
Output: true
Explanation: The digit sum of 56 is 5+6 = 11. Since, 11 is a palindrome number.Thus, answer is true.
Input: n = 98
Output: false
Explanation: The digit sum of 98 is 9+8 = 17. Since 17 is not a palindrome,thus, answer is false.
Constraints:
1 <= n <= 109

https://www.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1
*/

// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {

        int num=n;
        int sum=0;
        
        
        //get sum of digits
        while(num>0)
        {
            int rem=num%10;
            
            sum+=rem;
            num=num/10;
        }
        
        
        //get the reverse of sum 
        int temp=sum;
        int reversedSum=0;
        while(temp>0){
            int rem=temp%10;
            reversedSum=reversedSum*10+rem;
            temp=temp/10;
        }
        
        
        //compare both
        
        return sum==reversedSum;
    }
}
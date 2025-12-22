/*LCM And GCD

Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.

Examples:

Input: a = 5 , b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
Input: a = 1 , b = 1
Output: [1, 1]
Explanation: LCM of 1 and 1 is 1, while their GCD is 1.

https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
*/

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int lcm=0, gcd=0;
        
        // this method takes a lot of time to find lcm
       
        // int k=Math.min(a,b);
        // while(k<=a*b)
        // {if(k%a==0 && k%b==0)
        //     {
        //         lcm=k;
        //         break;
        //     }
        //     k++;
            
        // }
        
        for(int i=Math.min(a,b); i>0; i--){
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
            }
        }
        lcm=(a*b)/gcd;
        
        return new int[]{lcm,gcd};
    }
}
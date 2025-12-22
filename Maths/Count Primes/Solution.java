/*Count Primes
Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 

Constraints:

0 <= n <= 5 * 106

https://leetcode.com/problems/count-primes/description/
*/

class Solution {
    public int countPrimes(int n) {

        //using Sieve of Eratosthenes
       boolean[] sieve=new boolean[n+1];
        int count=0;

        for(int i=2; i<=n; i++)
        {
            sieve[i]=true;
        }
       
        for(int i=2; i*i<=n; i++)
        {
            if(sieve[i])
            {
                for(int j=i*i; j<=n; j+=i)
                {
                    sieve[j]=false;
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            if(sieve[i])
            count++;
        }

        return count;



        //  if(n<2)return 0;
        // int count=0;
        
        // for(int k=2; k<n; k++)
        // {
        //     boolean isprime=true;
        //     for(int i=2; i<=(int)Math.sqrt(k); i++)
        //     {
        //         if(k%i==0){
        //            isprime=false;
        //            break;
        //         }
        //     }
        //     if(isprime){count++;}            
        // }  
        // return count;
    }
}
/*Swapping pairs make sum equal
Given two arrays of integers a[] and b[], the task is to check if a pair of values (one value from each array) exists such that swapping the elements of the pair will make the sum of two arrays equal.

Examples :

Input: a[] = [4, 1, 2, 1, 1, 2], b[] = [3, 6, 3, 3]
Output: true
Explanation: Sum of elements in a[] = 11, Sum of elements in b[] = 15, To get same sum from both arrays, we can swap following values: 1 from a[] and 3 from b[]
Input: a[] = [5, 7, 4, 6], b[] = [1, 2, 3, 8]
Output: true
Explanation: We can swap 6 from array a[] and 2 from array b[]
Input: a[] = [3, 3], b[] = [6, 5, 6, 6]
Output: false
Constraints:
1 ≤ a.size() ≤ 106
1 ≤ b.size() ≤ 106
1 ≤ a[i] ≤ 103
1 ≤ b[i] ≤ 103

https://www.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal4142/1

*/

// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
       int suma=0;
       int sumb=0;
       
       for(int i=0; i<a.length; i++)
       {
           suma+=a[i];
       }
       
       for(int i=0; i<b.length; i++)
       {
           sumb+=b[i];
       }
       
       for(int j=0;j<a.length; j++)
       {
           for(int k=0; k<b.length; k++)
           {
               int replaceda=suma-a[j]+b[k];
               int replacedb=sumb+a[j]-b[k];
               
               if(replaceda==replacedb)
               {
                //   System.out.println(replaceda+" "+ replacedb);
                //   System.out.println(a[j]+" "+ b[k]);
                   return true;
               }
           }
       }
       return false;
       
    }
}

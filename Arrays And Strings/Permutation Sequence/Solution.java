/*Permutation Sequence
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

 

Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
Example 3:

Input: n = 3, k = 1
Output: "123"
 

Constraints:

1 <= n <= 9
1 <= k <= n!

https://leetcode.com/problems/permutation-sequence/description/

*/
//needs to be optimised, this solution gives TLE error
import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
       List<List<Integer>> ans = new ArrayList<>();

        List<Integer> ip = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            ip.add(i);
        }
        permute(ip, new ArrayList<>(), ans);

        List<Integer>  result=ans.get(k-1);
        StringBuilder strResult=new StringBuilder();
        for(int num :result)
        {
            strResult.append(num);
        }
        return strResult.toString();
    } 
    public static void permute(List<Integer> ip, List<Integer> op, List<List<Integer>> ans)
    {
       // Base case
        if (ip.size() == 0) {
            ans.add(new ArrayList<>(op));
            return;
        }

        for (int i = 0; i < ip.size(); i++) {

            // create new input list
            List<Integer> newIp = new ArrayList<>(ip);
            int picked = newIp.remove(i);

            // create new output list
            List<Integer> newOp = new ArrayList<>(op);
            newOp.add(picked);

            permute(newIp, newOp, ans);
        }
    }
}

/*Array Duplicates

Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

Note: You can return the elements in any order but the driver code will print them in sorted order.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
Constraints:
1 ≤ n ≤ 106
1 ≤ arr[i] ≤ n

https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        ArrayList<Integer> ans=new ArrayList<Integer>();
        HashMap<Integer,Integer> mpp=new HashMap<Integer,Integer>();
        
        for(int i=0; i<arr.length; i++)
        {
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer, Integer> element: mpp.entrySet())
        {
            if(element.getValue()>1)
            {
                ans.add(element.getKey());
            }
        }
        //simpler version
        // for (int key : mpp.keySet()) {
        //     if (mpp.get(key) > 1) ans.add(key);
        // }
        return ans;
    }
}
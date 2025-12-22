/*Find All Duplicates in an Array
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.

https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
*/

import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      HashMap<Integer,Integer> mpp=new HashMap<Integer,Integer>();
      List<Integer> ans=new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++)
        {
            if(mpp.containsKey(nums[i]))
            {
                ans.add(nums[i]);
                mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
            }
            mpp.put(nums[i], 1);
        }

        return ans;   
    }
}
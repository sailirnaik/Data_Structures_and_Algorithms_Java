/*Single Element in a Sorted Array
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.


Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105


https://leetcode.com/problems/single-element-in-a-sorted-array/description/
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0, e=nums.length-1, n=nums.length ;

        if(nums.length==1)return nums[0];

        while(s<=e)
        {
            int m = s+(e-s)/2;

            if(m==0 && nums[0]!=nums[1]) return nums[0];//when mid is at index 0
            if(m==n-1 && nums[n-1]!=nums[n-2]) return nums[n-1];//when mid is at index n-1
            
            if(nums[m-1]!=nums[m] && nums[m]!=nums[m+1] ) return nums[m];

            if(m%2==0)
            {
                if(nums[m-1]==nums[m])
                {
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else{
                 if(nums[m-1]==nums[m])
                {
                    s=m+1;
                }else{
                    e=m-1;
                }
            }
        }
        return -1;
    }
}
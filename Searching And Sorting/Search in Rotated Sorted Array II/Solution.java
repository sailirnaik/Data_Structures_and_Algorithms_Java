/*Search in Rotated Sorted Array II
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
nums is guaranteed to be rotated at some pivot.
-104 <= target <= 104
 

Follow up: This problem is similar to Search in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?


https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
*/

class Solution {
    public boolean search(int[] arr, int target) {
        int s=0, e=arr.length-1;

        while(s<=e)
        {
            int m=s+(e-s)/2;

            if(arr[m]==target)return true;

            //handle duplicates
            if(arr[s]==arr[m] && arr[m]==arr[e])
            {
                s++;
                e--;
                continue;
            }

            if(arr[s]<=arr[m])
            {
                if(arr[s]<=target && target<arr[m])
                {
                    e=m-1;
                }
                else{
                    s=m+1;
                }

            }
            else{
                if(arr[m]<target && target<=arr[e])
                {
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
        }
        return false;
    }
}
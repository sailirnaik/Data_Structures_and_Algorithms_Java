/*Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109

https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
*/

class Solution {
    public int[] searchRange(int[] arr, int target) {
        boolean Isfirst=true;
        int[] ans={-1,-1};
        for(int i=0;i<2;i++) {
            int start=0;
            int end= arr.length -1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    ans[i]=mid;
                    if (Isfirst) {

                        end = mid - 1;

                    } else {
                        start = mid+1;

                    }
                }
            }
            Isfirst=false;
        }
        return ans;
    
    }
}
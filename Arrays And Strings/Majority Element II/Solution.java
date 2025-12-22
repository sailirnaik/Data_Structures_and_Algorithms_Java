/*Majority Element II
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 

Follow up: Could you solve the problem in linear time and in O(1) space?

https://leetcode.com/problems/majority-element-ii/description/
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        

        for(int i=0;i<n;i++){
            if(count1==0 && element2!=nums[i])
            {
                count1=1;
                element1=nums[i];
            }else if(count2==0 && element1!=nums[i])
            {
                count2=1;           
                element2=nums[i];
            }else if(element1==nums[i]){
                count1++;
            }else if(element2==nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }

        }
        List<Integer> ls = new ArrayList<>();
        count1=0; count2=0;
        for(int j=0;j<n;j++)
        {
            if(element1==nums[j]){count1++;}
            if(element2==nums[j]){count2++;}
        }
        int mini=(int)(n/3)+1;
        if(count1>=mini){ls.add(element1);}
        if(count2>=mini){ls.add(element2);}

    return ls;
    }
}

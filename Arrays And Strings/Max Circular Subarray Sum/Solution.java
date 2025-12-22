/*Max Circular Subarray Sum
You are given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.

Examples:

Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
Output: 22
Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
Output: 23
Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].
Input: arr[] = [5, -2, 3, 4]
Output: 12
Explanation: The circular subarray [3, 4, 5] gives the maximum sum of 12.
Constraints:
1 ≤ arr.size() ≤ 105
-104 ≤ arr[i] ≤ 104

https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1
*/


class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int total=0;
        int maxsum=KadanesMax(arr);
        int minsum=KadanesMin(arr);
        
        for(int i=0; i<arr.length; i++)
        {
            total+=arr[i];
        }
        //this part of code works when all elements are negative
        if(maxsum<0)
        {
            return maxsum;
        }
        
        return Math.max(maxsum,total-minsum);
    }

    public int KadanesMax(int[] arr)
    {
        int max=arr[0];
        int curr=arr[0];
        
        for(int i=1; i<arr.length; i++)
        {
            curr=Math.max(curr+arr[i], arr[i]);
            max=Math.max(max, curr);
        }
        return max;
    }
     public int KadanesMin(int[] arr)
    {
        int min=arr[0];
        int curr=arr[0];
        
        for(int i=1; i<arr.length; i++)
        {
            curr=Math.min(curr+arr[i], arr[i]);
            min=Math.min(min, curr);
        }
        return min;
    }
}


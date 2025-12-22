/*Equilibrium Point
Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. 

Examples:

Input: arr[] = [1, 2, 0, 3]
Output: 2 
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
Input: arr[] = [1, 1, 1, 1]
Output: -1
Explanation: There is no equilibrium index in the array.
Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.
Constraints:
3 <= arr.size() <= 105
-104 <= arr[i] <= 104
https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
*/

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        
        //BRUTE FORCE APPROACH
        // int n=arr.length;
        // for(int i=0; i<arr.length-1; i++)
        // {
        //     int leftsum=0;
        //     int rightsum=0;
            
        //     for(int j=0; j<i; j++)
        //     {
        //         leftsum+=arr[j];
        //     }
        //      for(int k=i+1; k<n; k++)
        //     {
        //         rightsum+=arr[k];
        //     }
        //     if(leftsum==rightsum)
        //     {
        //         return i;
        //     }
            
        // }
        // return -1;
        
        int n=arr.length;
        int totalsum=0, leftsum=0, rightsum=0;
        for(int i=0; i<n; i++)
        {
            totalsum+=arr[i];
        }
        rightsum=totalsum;
        
        for(int j=0; j<arr.length; j++)
        {
            rightsum-=arr[j];
            if(leftsum==rightsum)
            {
                return j;
            }
            leftsum+=arr[j];
        }
        return -1;
    }
}

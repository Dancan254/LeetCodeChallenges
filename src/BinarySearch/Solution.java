package BinarySearch;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class Solution {
    public static void main(String[] args) {

        int[] arr = {0, 9, 10, 12, 45};
        int index= search(arr, 10);
       // System.out.println("found in index: " + index);

        System.out.println("Found at index " + searchNumber(arr, 45));
    }
    //method to find the
    public static int search(int[] nums, int target) {
        //iterate through the array

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    //achieve better time complexity
    public static int searchNumber(int[] nums, int target){

        int i = 0;
        int j = nums.length - 1;

        while(i < nums.length && j > 0){
            if (nums[i] == target){
                return i;
            }
            else if (nums[i] < target){
                i++;
            }else{
                j--;
            }
        }

        return -1;
    }
}

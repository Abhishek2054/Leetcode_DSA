// Given an array of integers nums, return the number of good pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

// Example 1:
// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.



// Brutforce approach
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]) count++;
            }
        }

        return count;
    }
}




// // Optimal Solution
// import java.util.*;


// class Solution {

//     public int numIdenticalPairs(int[] nums) {
//         Map<Integer, Integer> pair = new HashMap<>();
//         int count = 0;
//         for(int i=0; i<nums.length; i++){
//             if(pair.containsKey(nums[i])){
//                 count += pair.get(nums[i]);
//             }
//             pair.put(nums[i], pair.getOrDefault(nums[i], 0) +1);
//         }

//         return count;
//     }
// }


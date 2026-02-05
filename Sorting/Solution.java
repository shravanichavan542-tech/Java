//MISIING NUMBERs
class Solution {
    public static void main(String args[]) {
        int arr[] = {3, 0, 1};
        Solution sol = new Solution();
        int missing = sol.missingNumber(arr);
        System.out.println("Missing number: " + missing);
    }

    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (correct < nums.length && nums[i] != nums[correct]) {
                // Swap nums[i] with nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // After sorting, the missing number is the first index where index != nums[index]
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        // If all numbers are at the correct index, the missing number is n
        return nums.length;
    }
}

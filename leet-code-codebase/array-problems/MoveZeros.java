//Move Zeroes (LeetCode #283)
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        
        // First pass: move all non-zero elements to front
        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != 0) {
                nums[writeIndex++] = nums[readIndex];
            }
        }
        
        // Second pass: fill remaining positions with zeros
        while (writeIndex < nums.length) {
            nums[writeIndex++] = 0;
        }
    }
}
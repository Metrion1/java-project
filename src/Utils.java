public class Utils {
    /*
    1. Check if the array is null or empty. If it is, then return "0"
    2. If it isnt empty then return the lenth of the array as an integer.
    3. create a loop that checks for even numbers in the array and adds them to a sum variable.
    4. create a loop that checks for odd numbers in the array and adds them to a sum variable.
    5. initalize a variable called sum to 0(loop invariant)
    6. loop through each element in the array.
    7. For each element check if it is even or odd.
    8. If it is even then add the element to the sum.
    9. After the loop completes return the sum.
    */

    public static int sumOfEvens(int[] nums) {

        int length = nums.length;

        if (nums == null || nums.length == 0) {
            return 0;
        }

        /*for loop
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }*/

        // for eaach loop
        int sum = 0; // Initialize sum to 0

        for (int num : nums) { // Loop through each element in the array
            if (num % 2 == 0) { // Check if the number is even
                sum += num; // Add even number to sum
            }
        }

        return sum; // Return the sum of even numbers
    }

    /*
    1. Check if the array is null or empty. If it is, then return "0".
    2. initalize a variable called sum to 0(loop invariant)
    3. Start count at 0
    4. Loop through each number in the array
    5. If the number matches target, increase count
    6. Return the total at the end
    */

public static int countOccurrences(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    int count = 0;

    for (int num : nums) {
        if (num == target) {
            count++;
        }
    }

    return count;
    }
}

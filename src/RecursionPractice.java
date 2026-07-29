public class RecursionPractice {
    //Write a recursive method that returns the factorial of n. Use a base case for when n == 0. 
    // Use a recursive case that multiplies n * factorial(n - 1).


    public static int factorial(int n) {
        //Base case: in n == 0, return 1
        if (n == 0) {
            return 1;
        }
        //Recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    //Write a recursive method that returns the total sum of the array. The base case happens when index reaches the end of the array. 
    // The recursive case adds the current element to the sum of the rest: arr[index] + sumArray(arr, index + 1).

    public static int sumArray(int[] array, int index) {
        //base case: if index is equal to the length of the array, return 0
        if (index == array.length) {
            return 0;
        }
      //recursive case: 
      return array[index] + sumArray(array, index + 1);
    }
//Write a recursive method that returns the nth Fibonacci number. Use base cases for n == 0 and n == 1.
//  The recursive case should return fibonacci(n - 1) + fibonacci(n - 2)

    public static int fibonacci(int n) {
        //base case: if n == 0, return 0
        if (n == 0) {
            return 0;
        }
        //base case: if n == 1, return 1
        if (n == 1) {
            return 1;
        }
        //recursive case: fibonacci(n - 1) + fibonacci(n - 2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        //Test the factorial method.
        int num = 5; // factorial of 5 is 120s
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);

        //Test the sumArray method.
        int [] arr = {2, 4, 6, 8}; // array to sum
        int sum = sumArray(arr, 0);
        System.out.println("Sum of the array is: " + sum);

        int fib = fibonacci(7); // fib of 7 is 13
        System.out.println("Fibonacci of " + 7 + " is: " + fib);
    }
}

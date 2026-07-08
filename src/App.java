public class App {
    public static void Edgecases() {
        /*  --- Edge Case: null array ---
        int[] caseNull = null;
        System.out.println("Null array → " + countOccurrences(caseNull, 5));

        // --- Edge Case: empty array ---
        int[] caseEmpty = new int[0];
        System.out.println("Empty array → " + countOccurrences(caseEmpty, 5));

        // --- Edge Case: single element (match) ---
        int[] caseSingleMatch = {5};
        System.out.println("Single element (match) → " + countOccurrences(caseSingleMatch, 5));

        // --- Edge Case: single element (no match) ---
        int[] caseSingleNoMatch = {3};
        System.out.println("Single element (no match) → " + countOccurrences(caseSingleNoMatch, 5));

        // --- Edge Case: negative numbers ---
        int[] caseNegative = {-1, -5, -5, -2};
        System.out.println("Negative numbers → " + countOccurrences(caseNegative, -5));

        // --- Edge Case: all equal elements (match) ---
        int[] caseAllEqualMatch = {7, 7, 7, 7};
        System.out.println("All equal (match) → " + countOccurrences(caseAllEqualMatch, 7));

        // --- Edge Case: all equal elements (no match) ---
        int[] caseAllEqualNoMatch = {7, 7, 7, 7};
        System.out.println("All equal (no match) → " + countOccurrences(caseAllEqualNoMatch, 5));

        // --- Edge Case: mixed values ---
        int[] caseMixed = {1, 5, 3, 5, 2, 5};
        System.out.println("Mixed values → " + countOccurrences(caseMixed, 5));*/
        //sumOfEvens, CountOccurrences.

         int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = Utils.sumOfEvens(numbers);

        System.out.println("Hello, Java in VS Code!");
        System.out.println("Sum of even numbers: " + sum);

    }

    public static void StudentTest() {
        Student ana = new Student("Ana", 1, 3.8);
        Student bob = new Student("Bob", 2, 3.5);
        Student anaj = new Student("Ana Jones", 1, 3.8);

        System.out.println(ana.toString()); // Output: Ana (ID: 1, GPA: 3.8)
        System.out.println(bob.toString()); // Output: Bob (ID: 2, GPA: 3.5)

        System.out.println(ana.equals(bob)); // Output: false
        System.out.println(ana.equals(anaj)); // Output: true
    }
    public static void main(String[] args) throws Exception {
        //Edgecases();
        StudentTest();     
    }
}

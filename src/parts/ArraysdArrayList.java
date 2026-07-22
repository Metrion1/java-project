package parts;

import java.util.ArrayList;

public class ArraysdArrayList {

    public static void ArrayExample() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Array elements:");
        // for each loop to print array elements
        for (int number : numbers) {
            System.out.println(number);
            // for loop to print array elements
            /*
             * for (int i = 0; i < numbers.length; i++) {
             * System.out.println(numbers[i]);
             * }
             */

            numbers[numbers.length] = 10; // This line will throw an ArrayIndexOutOfBoundsException
            System.out.println("Array lenth: " + numbers.length);
            // ArrayList example
        }
    }

    public static void ArrayListExample() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("ArrayList size: " + numbers.size());// need to use .size() for ArrayList

        System.out.println("ArrayList elements for loop:");
        // for loop to print ArrayList elements
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("ArrayList element while loop:");
        numbers.add(6);
        //numbers.add("7"); // This line will throw a compile-time error because "7" is a String, not an Integer
        int index = 0; // index variable for while loop
        while (index < numbers.size()) { // while loop to print ArrayList elements
            System.out.println(numbers.get(index)); // get() method to access elements in ArrayList
            index++;
        }
    }

    public static void main(String[] args) throws Exception {
        // ArrayExample();
        ArrayListExample();
    }
}

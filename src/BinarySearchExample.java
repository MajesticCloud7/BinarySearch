/* Program: Binary Search Example
 * Written by: Chaitanya from beginnersbook.com
 * Input: Number of elements, element's values, value to be searched
 * Output:Position of the number input by user among other numbers*/

import java.util.Scanner;

class BinarySearchExample {
    public static void main(String args[]) {
        int num, item, array[];
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = input.nextInt();

        //Creating array to store the all the numbers
        array = getIntArray(num, input);

        System.out.println("Enter the search value:");
        item = input.nextInt();

        if (!search(num, array, item))
            System.out.println(item + " is not found.\n");
    }

    private static int[] getIntArray(int num, Scanner input) {
        int[] array = new int[num];

        System.out.println("Enter " + num + " integers");
        //Loop to store each numbers in array
        for (int i = 0; i < num; i++)
            array[i] = input.nextInt();

        return array;
    }

    private static boolean search(int num, int[] array, int item) {
        int first = 0;
        int last = (byte) (num - 1);
        int middle = (byte) ((first + last) / 2);

        while (first <= last) {
            if (array[middle] < item)
                first = (byte) (middle + 1);
            else if (array[middle] == item) {
                System.out.println(item + " found at location " + (middle + 1) + ".");
                break;
            } else {
                last = (byte) (middle - 1);
            }
            middle = (byte) ((first + last) / 2);
        }

        return first <= last;
    }
}
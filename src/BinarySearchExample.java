/* Program: Binary Search Example
 * Written by: Chaitanya from beginnersbook.com
 * Input: Number of elements, element's values, value to be searched
 * Output:Position of the number input by user among other numbers*/
import java.util.Scanner;
class BinarySearchExample
{
    public static void main(String args[])
    {
        byte num, item, array[], first, last, middle;
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = input.nextByte();

        //Creating array to store the all the numbers
        array = getIntArray(num, input, 0);

        //Asking user to enter values
        System.out.println("Enter the search value:");
        item = input.nextByte();
        first = 0;
        last = (byte) (num - 1);
        middle = (byte) ((first + last)/2);

        while( first <= last )
        {
            if ( array[middle] < item )
                first = (byte) (middle + 1);
            else if ( array[middle] == item )
            {
                System.out.println(item + " found at location " + (middle + 1) + ".");
                break;
            }
            else
            {
                last = (byte) (middle - 1);
            }
            middle = (byte) ((first + last)/2);
        }
        if ( first > last )
            System.out.println(item + " is not found.\n");
    }

    private static byte[] getIntArray(int num, Scanner input, int cntr) {
        byte array[] = new byte[num];

        System.out.println("Enter " + num + " integers");
        //Loop to store each numbers in array
        for (cntr = 0; cntr < num; cntr++)
            array[cntr] = input.nextByte();

        return array;
    }
}
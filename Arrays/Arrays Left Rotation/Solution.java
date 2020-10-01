import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        // Example 
        // a = {1, 2, 3, 4, 5} 
        // d = 2 rotations
        // a.length = 5
        // create new array that will be returned
        // new array filled up first with {3, 4, 5, 0, 0}
        // then filled with the remaining values {3, 4, 5, 1, 2}

        int newArray[] = new int[a.length];
        int i = 0;
        int rotateIndex = d;

        // while(rotateIndex < a.length)
        // {
        //     newArray[i] = a[rotateIndex];
        //     i++;
        //     rotateIndex++;
        // }

        // rotateIndex = 0;
        // // You want to keep i the same
        // // to keep track of the index in the array

        // while(i < a.length)
        // {
        //     newArray[i] = a[rotateIndex];
        //     i++;
        //     rotateIndex++;
        // }

        for(rotateIndex = rotateIndex, i = 0; rotateIndex < a.length; i++, rotateIndex++)
        {
            newArray[i] = a[rotateIndex];
        }

        for(rotateIndex = 0, i = i; i < a.length; i++, rotateIndex++)
        {
            newArray[i] = a[rotateIndex];
        }


        return newArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

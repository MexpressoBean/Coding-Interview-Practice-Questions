class Solution {
    public void reverseString(char[] s) {

        int firstPointer = 0;             // First array element
        int secondPointer = s.length - 1; // Last array element

        // Go inward through the array and swap the
        // elements at the ends (each pointer)
        while(firstPointer <= secondPointer)
        {
            char temp = s[firstPointer]; // Temp variable holds the first array element

            s[firstPointer] = s[secondPointer]; // Assign the value of second pointer to the first                                                       // pointer

            s[secondPointer] = temp;    // Assign the value of the temp into the second pointer
                                        // completing the swap the first and second pointer values

            firstPointer++; // Increment first pointer - move inward from the first element
            secondPointer--;// Decrement second pointer - move inward from the last element
        }
    }
}

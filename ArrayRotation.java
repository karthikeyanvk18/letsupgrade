import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationCount = 2;

        int[] rotatedArr = rotateArray(arr, rotationCount);
        System.out.println(Arrays.toString(rotatedArr));
    }

    public static int[] rotateArray(int[] arr, int rotationCount) {
        int n = arr.length;

        // Normalize rotation count to handle large values
        rotationCount %= n;

        // Return the original array if rotation count is 0
        if (rotationCount == 0) {
            return arr;
        }

        // Create a new array to store the rotated elements
        int[] rotatedArr = new int[n];

        // Copy the rotated elements to the new array
        for (int i = 0; i < n; i++) {
            int rotatedIndex = (i + rotationCount) % n;
            rotatedArr[rotatedIndex] = arr[i];
        }

        return rotatedArr;
    }
}

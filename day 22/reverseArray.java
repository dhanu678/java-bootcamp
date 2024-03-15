import java.util.Arrays;

class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 34, 56, 76};
        int[] newArray = reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArray));
    }

    static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[arr.length - 1 - i] = arr[i];
        }
        return reverse;
    }
}

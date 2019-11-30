public class BubbleSort {

    public static void main(String[] args) {
        int[] unsortedArr = {7,15,8,4,32,27,5,0,3};
        int arrLength = unsortedArr.length;

        int temp = 0;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 1; j < arrLength-i; j++) {
                if (unsortedArr[j-1] > unsortedArr[j]) {
                    // switch elements
                    temp = unsortedArr[j-1];
                    unsortedArr[j-1] = unsortedArr[j];
                    unsortedArr[j] = temp;
                }
            }
        }
        for (int i = 0; i < unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] +" ");
        }
    }
}

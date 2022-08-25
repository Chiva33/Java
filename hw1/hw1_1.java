class Solution {
    public void duplicateZeros(int[] arr) {
       int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                for (int j = size-2; j >= i; j--) {
                    arr[j+1] = arr[j];
                }
                arr[i++] = 0;
            }
        }
    }
}
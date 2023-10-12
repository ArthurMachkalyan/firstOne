package JavaDevelopment;

public class BabbleExample {

    public void bubbleSort(int[] arr) {
        var sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                var previous = arr[i-1];
                var current = arr[i];
                if (previous > current) {
                    swap(arr,i-1, i);
                    sorted = false;
                }
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        var temp = arr [index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

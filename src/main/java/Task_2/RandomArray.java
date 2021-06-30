package Task_2;

import java.util.Random;

public class RandomArray {

    private final int[] array;

    public RandomArray(int size) {
        this.array = new Random().ints(size).toArray();
    }
    public RandomArray quickSortArray(){
        quickSort(array,0,array.length-1);
        return this;
    }
    public int[] getArray() {
        return array;
    }

    public void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int mergeIndex = merge(array, begin, end);
            quickSort(array, begin, mergeIndex - 1);
            quickSort(array, mergeIndex + 1, end);
        }
    }

    private int merge(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = (begin - 1);
        int temp;
        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return i + 1;
    }

}

/**
 * 常见的排序算法java实现
 */
public class AllSort {
    public static void main(String[] args) {
        Integer[] arr = {1,7,5,9,3,2};
//        bubbleSort(arr);
        selectorSort(arr);
        for(Integer i:arr){
            System.out.print(i + " ");
        }
    }

    /**
     * 1.冒泡
     * @param array
     */
    private static void bubbleSort(Integer[] array){
        for(int i=array.length-1;i>0;i--){
            boolean flag = true;
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    /**
     * 2.选择
     * @param array
     */
    private static void selectorSort(Integer[] array){
        for(int i=0;i<array.length;i++){
            int min = i;
            for(int j=i+1;j<array.length-1;j++){
                if(array[i]>array[j]){
                    min = j;
                }
            }

            if(min != i){
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }

    /**
     * 3.插入排序
     * @param array
     */
    private static void insertSort(Integer[] array){

    }

    /**
     * 4.希尔排序
     * @param array
     */
    private static void shellSort(Integer[] array){

    }

    /**
     * 5.归并
     * @param array
     */
    private static void mergeSort(Integer[] array){

    }

    /**
     * 6.快速排序
     * @param array
     */
    private static void quickSort(Integer[] array){

    }

    /**
     * 7.堆排序
     */
    private static void stackSort(Integer[] array){

    }

    /**
     * 8.计数排序
     */
    private static void countingSort(Integer[] array){

    }

    /**
     * 9.桶排序
     * @param array
     */
    private static void bucketSort(Integer[] array){

    }

    /**
     * 10.基数排序
     * @param array
     */
    private static void radix(Integer[] array){

    }
}

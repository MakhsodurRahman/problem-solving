public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {77,5,3,7,3};
        int len = arr.length;

        int i , j, temp;
        for (i = 0; i<len; i++){
            for (j = 0; j<len -i -1; j++){
                if(arr[j] >arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a : arr){
            System.out.println(a);
        }
    }
}

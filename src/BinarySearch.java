public class BinarySearch {
    public static int binary_search(int[] arr, int n,int value){

        int left,right, mid;
        left = 0;
        right = n - 1;

        while (left <= right){
            mid = (left+right)/2;

            if(arr[mid]==value){
                return value;
            }
            if(arr[mid]<value){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;

        int result = binary_search(arr,n,73);
        System.out.println(result);

    }
}

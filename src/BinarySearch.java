import java.util.Scanner;

public class BinarySearch {
    public static int binary_search(int[] arr, int n,int value){

        int left,right, mid;
        left = 0;
        right = n - 1;

        while (left <= right){
            mid =left + (left+right)/2;

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

        int n,value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your length of Array : ");
        n = scanner.nextInt();
        System.out.println("enter your search value : ");
        value = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter your array");
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }


        int result = binary_search(arr,n,value);
        if(result == -1){
            System.out.println(value + " is not found");
        }
        else {
            System.out.println(value + " is found " + result + " position");
        }
    }
}

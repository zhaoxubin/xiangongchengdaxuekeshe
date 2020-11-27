public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int x = binarySearch(arr, 7);
        System.out.println(x);
    }

    private static int binarySearch(int[] arr,int x) {
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid = (left+right)/2;
            if(arr[mid] == x){
               return mid;
            }else if(arr[mid] > x){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
}

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,2,4,5,3,9,1};
       // bubbleSort(arr);
        //  insertSort(arr);
        quickSort(arr,0,arr.length-1);
        for (int x : arr ) {
            System.out.print(x);
        }
    }

    private static void quickSort(int[] arr,int left,int right) {
        if(left >= right){
            return;
        }
        int index = partation(arr,left,right);
        quickSort(arr,left,index-1);
        quickSort(arr,index+1,right);
    }

    private static int partation(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int base = arr[right];
        while(i < j){
            while(i < j && arr[i] < base){
                i++;
            }
            while (i < j && arr[j] > base){
                j--;
            }
            swap(arr,i,j);

        }
        swap(arr,i,right);
        return i;
    }

    private static void swap(int[] arr, int i, int right) {
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
    }

    private static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length;i++){
            int v = arr[i];
            int cur = i-1;
            for (;cur >= 0;cur--){
                if(arr[cur] > v){
                    arr[cur+1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1] = v;
        }
    }

    private static void bubbleSort(int[] arr) {
        for(int bound = 0; bound < arr.length-1;bound++){
            for(int cur = arr.length-1;cur > bound;cur--){
                if(arr[cur] < arr[cur-1]){
                    int temp = arr[cur];
                    arr[cur] = arr[cur-1];
                    arr[cur-1] = temp;
                }
            }
        }
    }
}

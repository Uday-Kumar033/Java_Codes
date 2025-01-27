public class insertionS{
      //Here we create a function to print array
      public static void printArr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //Array declaration
        int arr[] = {2,7,9,0,2,3,5};
        //insertion Sort
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > curr){
                //Swapping
                arr[j+1]  = arr[j];
                j--;
            } 
            arr[j+1] = curr;
        }
        printArr(arr);
    }  
}

public class selectionS{
    //Here we create a function to print array
     public static void printArr(int arr[]){
         for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
     }
    public static void main(String args[]){
      //Declare Array  
      int arr[] = {4,3,8,2,0,1,9,5};
      //Selection Sort
      for(int i = 0;i<arr.length - 1;i++){
        // temp var 
        int  small = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                small = j; 
            }
        }
        //Swapping
        int tp = arr[small];
        arr[small] = arr[i];
        arr[i] = tp;
      }
      printArr(arr);
    }
 }
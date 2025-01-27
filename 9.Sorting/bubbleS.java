public class bubbleS {
    //Here we create a function to print array
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //Declare array 
        int arr2[]= {1,3,4,3,2,1,0,9,5};
        //Bubble Sort 
        for(int i=0;i<arr2.length-1;i++){
            for(int j=0;j<arr2.length-1-i; j++){
                if(arr2[j]>arr2[j+1]){
                    //Swapping using third Var
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
        //function call
        printArr(arr2);
    }
}

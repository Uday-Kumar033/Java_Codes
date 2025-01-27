public class print1t5 {
    public static void printNm(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNm(n+1);
    }
    public static void main(String[] args) {
        printNm(0);
    }
    
}

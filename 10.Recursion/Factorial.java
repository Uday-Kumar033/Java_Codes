public class Factorial {
    public static void printFact(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact*=n;
        printFact(n-1, fact);
    }
    public static void main(String[] args) {
        printFact(5, 1);
    }
    
}

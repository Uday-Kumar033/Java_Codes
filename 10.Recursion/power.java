public class power {
    public static int printPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xminn = printPower(x,n-1);
        int xn = x*xminn;
        return  xn;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}

public class ReverseStr {
    public static void printReverse(int idx, String str){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        // System.out.print(str.charAt(idx));
        printReverse(idx-1, str);
    }
    public static void main(String[] args) {
        String str = "uday";
        printReverse(str.length()-1, str);
    }
}

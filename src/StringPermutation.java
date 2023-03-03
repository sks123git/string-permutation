//Program to print string permutations.
public class StringPermutation {
    public static void permutation(String str, int left){
        if (left==str.length()-1){
            System.out.println(str);
        }else {
            for (int i = left; i <= str.length()-1; i++) {
                str = swap(str,left,i);
                permutation(str,left+1);
                str = swap(str,left,i);
            }
        }
    }
    public static String swap(String str,int start, int end){
        char b[]=str.toCharArray();
        char temp;
        temp=b[start];
        b[start]=b[end];
        b[end]=temp;
        return String.valueOf(b);
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str,0);
    }
}
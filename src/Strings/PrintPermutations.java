package Strings;

public class PrintPermutations {

    public static void main(String[] args) {
        String str = "abc";
        printPer(str , 0 , str.length());
    }

    private static void printPer(String str, int i, int length) {

        if(i == length){
            System.out.println(str.toString());
            return;
        }

        for(int k=i;k<length;k++){
            str = swap(str , i , k);
            printPer(str  ,i + 1 , length);
            str = swap(str , i  , k);
        }

    }

    private static String swap(String str, int i, int k) {
         char[] arr = str.toCharArray();
         char temp = arr[i];
         arr[i] = arr[k];
         arr[k] = temp;


        return   String.valueOf(arr);
    }
}

package Slidingwindow;

public class MaxSizeSubArray {
    public static void main(String[] args) {

        int arr[] = {2,3,5,2,9,7,1};
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j = i; j < i+3  &&  j < arr.length; j++){
                sum += arr[j];
            }
            if(sum > max ){
                max = sum;
            }

        }

        System.out.println(max);

    }
}

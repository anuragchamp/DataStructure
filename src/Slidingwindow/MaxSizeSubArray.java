package Slidingwindow;

public class MaxSizeSubArray {
    public static void main(String[] args) {



        int arr[] = {2,3,5,2,9,7,1};
        int size = 3;


        //brute force approch
        maxSubArray01(arr , size);

    }


    //brute force approch
    public  static void maxSubArraySum(int arr[]){
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

    //another way of doing this in linear time complexity
    public static void maxSubArray01(int arr[] , int size){

        int str = 0;
        int end = 0;
        int sum = 0;
        int max = 0;
        while(end < arr.length){
            sum += arr[end];
            if(end - str + 1 < size){
                end++;
            }
            else if(end - str + 1 == size){
                if(max < sum){
                    max = sum;
                }
                sum -= arr[str];
                str++;
                end++;
            }
        }
        System.out.println(max);

    }


}

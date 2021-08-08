package Slidingwindow;

import java.util.ArrayList;

public class MaxValueInSubArray {

    public static void main(String[] args) {
        int[] arr = {2,9,3,8,1,7,12,6,14};
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j = 0;
        int max = 0;
        int size = 3;
        while(j  < arr.length){

            int value =  arr[j];
            if(j- i + 1 < size){
                if(value > max){
                    max = value;
                }
                j++;
            }
            else if(j - i + 1 == size){
                if(max < value){
                    max = value;
                }
                list.add(max);
                i++;
                j++;
            }

        }

        System.out.println(list);
    }
}

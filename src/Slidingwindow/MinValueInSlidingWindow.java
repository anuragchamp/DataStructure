package Slidingwindow;

import java.util.ArrayList;

public class MinValueInSlidingWindow {

    public static void main(String[] args) {
        int wSize= 3;
        int arr[] = {12 , -1,-7,8,-16,30,16,28};
        ArrayList<Integer> nList = new ArrayList<>();
        int str = 0;
        int end = 0;
        int fNgv = Integer.MAX_VALUE;
        while(end < arr.length){
            if(arr[end] < 0){
                nList.add(arr[end]);
            }

            if(end - str + 1 < wSize){
                end++;
            }
            else if( end - str + 1  == wSize){
                if(nList.size() == 0){
                    System.out.println(0);
                }
                else {
                    System.out.println(nList.get(0));
                    if(arr[str] == nList.get(0)){
                        nList.remove(nList.get(0));
                    }

                }

                str++;
                end++;
            }
        }
    }


}

package StackAndQueue;

import java.util.Stack;

public class NextLargestElement {

    public static void main(String[] args) {

        int arr[] = {1,3,2,4 , 6,23,8};

        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int index = arr.length - 1;

        ans[index] = -1;
        st.push(arr[index]);
        index--;
        while(index >= 0){

            int u = st.peek();
            if(arr[index] > u){
                while(st.size() > 0 && u < arr[index]){

                    st.pop();
                    if(st.size() != 0)
                    u = st.peek();
                    else
                        u =-1;
                }
              if(st.size() == 0){
                  ans[index] = -1;
              }
              else{
                 u =  st.peek();
                 ans[index] = u;

              }
              st.push(arr[index]);
              index--;
            }
            else{
                ans[index] = u;
                st.push(arr[index]);
                index--;
            }
        }

        for(int i: ans){
            System.out.println(i);
        }


    }
}

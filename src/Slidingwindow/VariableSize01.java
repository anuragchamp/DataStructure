package Slidingwindow;

public class VariableSize01 {
    public static void main(String[] args) {

        int arr[] = {4,1,1,1,2,3,5};
        int i = 0;
        int j = 0;
        int sum = 0;
        int k = 5;
        int size = 0;
        while (j < arr.length){
            sum +=arr[j];
            if(sum < k){
                j++;
            }
            if(sum == k){
                if(j - i + 1 > size){
                    size = j - i + 1;
                }
                j++;

            }
            if(sum > k){
              while(sum > k){
                  sum -=arr[i];
                  i++;
              }
              j++;
            }
        }

        System.out.println(size);
    }
}

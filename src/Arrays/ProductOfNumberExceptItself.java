package Arrays;

public class ProductOfNumberExceptItself {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int ans[] = new int[arr.length];
        int product = 1;

        for(int i=0;i<arr.length;i++){
            if( i == 0){
                ans[i] = arr[i];
            }
            else{
                ans[i] = arr[i] * arr[i - 1];
            }

        }



        for(int i=arr.length-1;i >=0 ;i--){
            if(i == arr.length - 1){
                ans[i] = ans[i - 1];
                product = product * arr[i];
            }
            else if (i == 0){
                ans[i] = product;
            }
            else {
                ans[i] = ans[i - 1] * product;
                product = product * arr[i];

            }
        }


        for(int i: ans){
            System.out.println(i);
        }
    }
}

package Recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 2;
        int pow = 4;
         int ans = calPow(number , pow);
        System.out.println(ans);
    }

    private static int calPow(int number, int pow) {

        if(pow == 1){
            return number;
        }
        else if(pow % 2 == 0){
            int i = number * number *  calPow(number, pow / 2);
            return i;
        }
        else{
            int i = calPow(number, pow - 1);
            return number * i;
        }
    }
}

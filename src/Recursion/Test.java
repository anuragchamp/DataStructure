package Recursion;

public class Test {

    public static void main(String[] args) {

       long sum = 1111111111111111111L;
        demo(sum);
    }

    public static void demo(long num){

        if(num == 1){
            System.out.println("1");
            return ;
        }
        else if(num == 2){
            System.out.println(2);

        }
        else if(num == 4){
            System.out.println(4);

        }

        if(num % 2 == 0){
            demo(num /2);
        }
        else{
            long value = 3 * num + 1;
             demo(value);
        }
    }
}

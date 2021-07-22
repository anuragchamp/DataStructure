package Recursion;

public class Test01 {

    public static void main(String[] args) {
        test(5);
    }
    public static void test(int i){
        if(i == 0){
            return ;
        }
        System.out.println(i);
        test(--i);
    }
}

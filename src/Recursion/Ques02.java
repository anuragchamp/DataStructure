package Recursion;

public class Ques02 {
    public static void main(String[] args) {
        printFun(3);
    }

    public static void  printFun(int test){
        if(test < 1){
            return ;

        }
        else{
            System.out.println(test);
            printFun(test - 1);
            System.out.println(test);

        }
    }
}

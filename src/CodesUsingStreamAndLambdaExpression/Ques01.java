package CodesUsingStreamAndLambdaExpression;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

@FunctionalInterface
interface  func
{

    int mul(int a , int b);
}


public class Ques01
{

    public static void main(String[] args) {

        func c = (a , b) -> a * b;

        System.out.println(c.mul(3,5));


    }
}

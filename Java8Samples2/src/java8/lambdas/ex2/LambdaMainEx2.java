package java8.lambdas.ex2;

public class LambdaMainEx2 {

    public static void main(String[] args) {
        // lambda is the anonymous function so - No name, No Modifier, No Return type​
        MyFunctionalInterfaceForAddition add = (int sum1, int sum2) -> {
            return sum1 + sum2;
        };

        // rule 1.  If the body of the lambda contains only one statement then curly braces are optional
        MyFunctionalInterfaceForAddition add1 = (int sum1, int sum2) -> sum1 + sum2;

        // rule 2.  Java compiler also infers the type of the variables passed in the arguments, hence type is optional
        MyFunctionalInterfaceForAddition add2 = (sum1, sum2) -> sum1 + sum2;


        System.out.println(add.sum(1, 2));
        System.out.println(add.sum(2, 3));

    }
}

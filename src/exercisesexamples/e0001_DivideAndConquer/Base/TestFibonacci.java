package exercisesexamples.e0001_DivideAndConquer.Base;

import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int input;
        do{
            try {
                System.out.println("Enter zero or positive integer as index to get Fibonacci. Enter negative integer to quit.");
                input = in.nextInt();
                Fibonacci fibonacci = new Fibonacci(input);
                System.out.println(fibonacci.divideAndConquer());
            } catch (Exception e){
                break;
            }
        }while(input > -1);

        in.close();
    }
}

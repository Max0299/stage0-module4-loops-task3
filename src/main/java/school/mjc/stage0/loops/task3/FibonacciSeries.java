package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        int n = 0;
        System.out.println(a);
        System.out.println(b);
        for(;n<lastFibonacci-2;){
            n = a + b;
            a = b;
            b = n;
            System.out.println(n);
        }
    }
}

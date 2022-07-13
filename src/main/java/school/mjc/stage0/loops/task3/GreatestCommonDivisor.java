package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int count = Math.min(first,second);
        for(int n = count;n>=1;n--){
            if(first % n == 0 && second % n == 0){
                System.out.println(n);
                break;
            }
        }
    }
}

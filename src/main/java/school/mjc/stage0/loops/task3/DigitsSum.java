package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int summ = 0;
        String string = t + "";
        for(int i =0;i<string.length();i++){
            summ += t % 10;
            t = t /10;
        }
        System.out.println(summ);
    }
}

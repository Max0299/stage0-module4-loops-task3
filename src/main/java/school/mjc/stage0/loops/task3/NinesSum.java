package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
    int result = 0;
    String nine = "9";
    for(int i = 0;i<lengthOfLastNumber;i++){
        result+= Integer.parseInt(nine);
        nine += "9";
    }
        System.out.println(result);
    }
}

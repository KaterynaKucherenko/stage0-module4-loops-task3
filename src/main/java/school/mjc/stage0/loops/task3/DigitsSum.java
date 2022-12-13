package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
String plus = number + "";
	    int sum = 0;
	    int num = plus.length();
	    for (int x = 1; x<=num; x++){
	        sum+=number%10;
	        number=number/10;
	    }
	    System.out.println(sum);

    }
}

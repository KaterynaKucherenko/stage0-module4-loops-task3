package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

	    int viv1 = 0;
	    int viv2 = 1;
	    int sum;
	    int num=1;
	    for (int x = 1; x<=lastFibonacci; x++){
	        System.out.println(num);
	        sum=viv1+viv2;
	        viv1 = viv2;
	        viv2=sum;
	        num++;
	        if (viv2 >= lastFibonacci){
	            break;}}
    }
}

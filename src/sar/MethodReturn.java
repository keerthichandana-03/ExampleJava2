package sar;

public class MethodReturn {

	

public static void main(String[] args) {
	

	
	System.out.println( new MethodReturn().RR(5.5,5.5));
	}
double RR(double a,double b)
{
	double sum=0;
	sum=(a+b)/2.0;
	return sum;
}

}

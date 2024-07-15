package sar;

public class Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=20;
while(count>=0)
{
	if(count==7 || count==10)
	{
		count--;
		continue;
		
	}
	
	System.out.print(count+ " ");
	count--;
}
	}

}

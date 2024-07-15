package sar;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0; // initialization
do {
	if(i==8 || i==18)
	{
		i+=2;
		continue;
		
	}
	System.out.print(i + " ");
	i+=2; // increment
	
}while(i<=34); // condition check

	}

}

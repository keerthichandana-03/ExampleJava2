package sar;

public class ConstructorOverloading {

	
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		double c=0.0;
		ConstructorOverloading()
		{
			a=10;
			b=20;
			c=20.5;
		}
		ConstructorOverloading(int x, int y){
			a=x;
			b=y;
		}
		ConstructorOverloading(int x, double y){
			a=x;
			c=y;
		}
		ConstructorOverloading(int x, int y, double z){
			a=x;
			b=y;
			c=z;
		}
		void display() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		public static void main(String[] args) {
			//ConstructorOverloading co= new ConstructorOverloading();
			//co.display();
			//ConstructorOverloading co= new ConstructorOverloading(10,20);
			//co.display();
			//ConstructorOverloading co= new ConstructorOverloading(10,20.5);
			//co.display();
			ConstructorOverloading co= new ConstructorOverloading(10,20,10.0);
			co.display();



		}
}

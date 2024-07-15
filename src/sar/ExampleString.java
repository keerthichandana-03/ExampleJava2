package sar;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=" physic s ";
String s2="physics@9neuroplasticity.com";
String s3= new String("Hello");
String s4= new String("Hello");
String s5="PHYSICS";
System.out.println(s1);
System.out.println(s1+s2);
System.out.println(s3);
System.out.println(s1==s5);
System.out.println(s3==s4);
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s5));
System.out.println(s3.equals(s4));
System.out.println(s1.equalsIgnoreCase(s5));
System.out.println(s1.contains("P"));
System.out.println(s1.length());
System.out.println((s1.trim()));
System.out.println((s1.trim().length()));
System.out.println((s1.trim().toUpperCase()));
System.out.println((s5.toLowerCase()));


	}

}

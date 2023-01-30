package week2.day1;
public class calculator2 {
public void addition() {
	int a=2;
	int b=3;
	int c=a+b;
	System.out.println("Addition of two numbers is"+ c);
}
public void subtract(){
	int a=2;
	int b=3;
	int d=a-b;
	System.out.println("Subtraction of two numbers is"+ d);
}
public void multiply() {
	int a=2;
	int b=3;
	int e=a*b;
	System.out.println("Multiplication of two numbers is"+ e);
}

public void divide() {
	int a=2;
	int b=3;
	int f=a/b;
	System.out.println("Division of two numbers is"+ f);
}
    public static void main(String[] args) {
	calculator2 Cal= new calculator2();
	Cal.addition();
	Cal.subtract();
	Cal.multiply();
	Cal.divide();
}
}


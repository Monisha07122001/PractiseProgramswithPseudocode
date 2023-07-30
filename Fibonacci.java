//1. Intialize a as 0 and b  as 1 
//2. Declare 0 to third value
//3. use for loop iterate from 2 position and use c=a+b to add that number
//4. print the c value
//5. change the value as a=b and b=c



package practiceProgram;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0, b=1, c=0;
		System.out.println(a+ +b);
		for(int i=2;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

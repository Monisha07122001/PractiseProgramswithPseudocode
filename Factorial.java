//1. Declare fact value as 1
//2. use for loop to iterate the value from 6-1
//3. use logic of factorial as fact*i
//4. print the fact value

package practiceProgram;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		for(int i=6;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}

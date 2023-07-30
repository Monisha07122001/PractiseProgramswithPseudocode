//1. get an array value and store it in a variable
//2. sort the array using the logic 
//3. use for loop to print the value in ascending order
//4. use for loop to print the value in descending order

package practiceProgram;

import java.util.Arrays;

public class SortingTheNumber {
	public static void main(String[] args) {
		int[] num= {6,3,4,8,1,0,20,50};
		// Sorting Array
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+ " ");
		}
		System.out.println();
		for(int j=num.length-1;j>=0;j--) {
			System.out.print(num[j]+ " ");
		}
	}

}

//1. Get the array
//2. use the minvalue logic and find the minimum value
//3. use for loop to iterate to find the minimum value
//4. Print the minimum value

package practiceProgram;


public class MaxValue {
	public static void main(String[] args) {
		int n[]= {4,50,8,9,59};
		int minValue=Integer.MIN_VALUE;
		System.out.println();
		System.out.println(minValue);
		for(int i=0; i<=n.length-1;) {
			if(n[i]>minValue) {
				minValue=n[i];
				i++;
		}
				System.out.println(minValue);
				break;
			}
		
		}
	
	

}
	







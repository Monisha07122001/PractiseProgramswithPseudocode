//1. get 2 arrays and store it in a variable
//2. take the length of each array
//3. use for loop to get iterate
//4. compare the two array and find the common number and print that number

package practiceProgram;

public class FindingIntersection {
public static void main(String[] args) {
	int[]  num= {2,3,4,5,7,9,10};
	int[] num2= {2,5,0,1,7,8,9};
	int c=num.length;
	int d=num2.length;
	for(int i=0;i<c;i++) {
		for(int j=0;j<d;j++) {
			if(num[i]==num2[j]) {
				System.out.print(num[i]+ " ");
			}
		}
	}
}

}

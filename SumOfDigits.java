/* Write a recursive function that returns the sum of the digits of a given integer.
Sample Input :
12345
Sample Output :
15
*/

public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
     return sumOfDigits(input , 0);
	}
  public static int sumOfDigits(int input, int n){
		// Write your code here
     if (input==0)
       return 0;
    
    int k =sumOfDigits (input/10,n );
    n=k+input%10;
    return n;
	}
}

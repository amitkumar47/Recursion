/* Given an integer n, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer n
Output Format :
No. of 0s
*/

public class solution {

	public static int countZerosRec(int input){
		// Write your code here
      
      return countZerosRec(input,0);
	}
  
   public static int countZerosRec(int input , int n){
     if (input==0)
       return n;
     if (input%10==0)
       n++;
     
     return countZerosRec(input/10, n);
     
     
     
     
   }
  
}

/* Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion. Return the answer.
Sample Input :
3
Sample Output :
1.875
*/

public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        return findGeometricSum(k, 0);
	}
  public static double findGeometricSum(int k, double n){
		if (k==0)
          return 1;
        
      double a= findGeometricSum (k-1,n);
    n=a+(1.0/Math.pow(2,k));
    return n;
	}
}

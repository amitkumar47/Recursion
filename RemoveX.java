/*  Given a string, compute recursively a new string where all 'x' chars have been removed.
Sample Input 1 :
xaxb
Sample Output 1:
ab
*/


public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
      String ans="";
      return removeX(input,0, ans);
	}
  public static String removeX(String input,int n, String ans ){
		// Write your code here
       int k= input.length()-1;
    if (k==n && input.charAt(n)=='x')
      return ans;
    else if (k==n && input.charAt(n)!='x')
      return ans= ans + input.charAt(n);
    if (input.charAt(n)=='x')
      ans =ans +removeX(input, n+1, ans);
    else if (input.charAt(n)!='x')
      ans = ans+ input.charAt(n)+removeX(input, n+1, ans);
     return ans;
	}
}

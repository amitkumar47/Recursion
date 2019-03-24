/* Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
Sample Input 1 :
xpix
Sample Output :
x3.14x
*/
public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
      String ans="";
        return replace (input, 0 , ans);
      
	}
  public static String replace (String input , int n, String ans){
    int k= input.length()-1;
    if (n==k+1 )
      return ans= ans;
    else if (n==k && input.charAt(n)!='i' )
      return ans= ans+input.charAt(k);
    if (input.charAt(n)=='p' && input.charAt(n+1)=='i'){
      ans = ans + "3.14" +replace (input , n+2,ans );
    }
    else 
      ans=ans+input.charAt(n)+replace(input , n+1, ans);
    return ans;
    
    
    
  }
}

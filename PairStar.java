/*  Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Sample Input 1 :
hello
Sample Output 1:
hel*lo
*/


public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
   String ans ="";
      return addStars (s,0,ans);
	}
  public static String addStars (String s, int n , String ans){
    int k = s.length()-1;
    if (k==n )
      return ans+s.charAt(n);
    if (k<n)
      return ans;
    
    if (s.charAt(n)==s.charAt(n+1))
      ans=ans+s.charAt(n)+"*"+addStars(s,n+1,ans);
    else 
      ans=ans+s.charAt(n)+addStars(s,n+1,ans);
    return ans;
    
    
    
    
    
  } 
}

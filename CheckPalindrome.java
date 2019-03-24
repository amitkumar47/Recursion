
public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here      
      return isStringPalindrome(input,0);     
      
	}
  public static boolean isStringPalindrome(String input,int n) {
		int k=input.length();
         if (k/2==n-1 && input.charAt(n)==input.charAt(k-n-1) )
           return true;
        
           
         if (input.charAt(n)!=input.charAt(k-n-1))
           return false;
        return isStringPalindrome(input, n+1); 
	}
}

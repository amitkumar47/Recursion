/* Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string (string, Eg. "1234")
Output format :
Corresponding integer (int, Eg. 1234)
*/


public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
      
      return convertStringToInt(input, 0,0);
      

	}
  public static int convertStringToInt (String input, int n, int sum){
    int k = input.length()-1;
    if (k==n)
      return (sum*10)+input.charAt(n)-48;
    
    sum= (sum *10)+input.charAt(n)-48;
    int m=convertStringToInt(input, n+1 ,sum);
    
    return m;
  }
}

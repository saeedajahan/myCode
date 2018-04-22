package string;

import java.util.Arrays;
import java.util.Scanner;


public class PermutationStrings {
public static void main(String[] args){
	//String s1="saeeda";
	//String s2="saeda";
	System.out.println("plz enter 2 string to check whether it is in permutation or not");
	Scanner input=new Scanner(System.in);
	String s1=input.nextLine();
	String s2=input.nextLine();
	// checkPermutation(s1,s2);
	 
	 

	if(isPermutation(s1, s2)){
	System.out.println("in permutation");}
	else{
		System.out.println("not in permutation");
	}
}

/*public static void checkPermutation(String s1, String s2){
	s1=sortString( s1);
	s2=sortString( s2);
	
	if(s1.equalsIgnoreCase(s2)){
		System.out.println("string 1 is permutation of aother");
		}else{
			System.out.println("Given String are not in permutation");
		}
	
}*/
/*public static String sortString(String s){
	char tempArray1[]=s.toCharArray();
	Arrays.sort(tempArray1);
	return new String(tempArray1) ;
}*/

public static boolean isPermutation(String s1, String s2)
{
    char[] x = s1.toCharArray();
    char[] y = s2.toCharArray();
    Arrays.sort(x);
    Arrays.sort(y);
    if(Arrays.equals(x, y))
        return true;
    return false;
}
}

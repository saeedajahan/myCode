package string;

import java.util.Scanner;

public class UniqueChar {
public static void main(String[] args){
	UniqueChar uc= new UniqueChar();
	System.out.println("plz enter a string to compare");
	Scanner input= new Scanner(System.in);
	String s1=input.nextLine();
	if(isUniaque(s1)){
		System.out.println("unique character");
	}else{
		System.out.println("duplicate character");
	}
/*	if(checkForUnique(s1)){
		System.out.println("duuplicate character");
	}else{
		System.out.println("unique character");
	}*/
}



public static boolean isUniaque(String s1){
	for (int i=0;i<s1.length();i++){
		for(int j=i+1;j<s1.length();j++){
		if(s1.charAt(i)==(s1.charAt(j))){
			return false;
		}
	}
}
	return true;
}

/*public static boolean checkForUnique(String str){
    boolean containsUnique = false;

    for(char c : str.toCharArray()){
        if(str.indexOf(c) == str.lastIndexOf(c)){//last occurenece of particular character// index of ----first
            containsUnique = true;
        } else {
            containsUnique = false;
        }
    }

    return containsUnique;
}*/

}


	



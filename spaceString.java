package string;

public class spaceString {
	public static StringBuilder replaceStrng(String str){
		StringBuilder cg=new StringBuilder();
		String[] sparray=str.split(" ");
		for(int i=0;i<sparray.length;i++){
			
			if(sparray!= null);{
				 cg=cg.append(sparray[i]).append("%20");}
		}
		return cg;
	}
	
	public static void main(String[] args){
		
		String s="'mr john smith'";
		System.out.println(replaceStrng(s));
		
		
	
	
		
	}
	
	
	
}

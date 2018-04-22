package string;

public class urlifyGoogle {
	

	 

	 public static void main(String[] args) {
	    String string = "Mr john smith";
	    char[] array = string.toCharArray();
	    System.out.println("\n\nInput : " +string);
	    System.out.println("\n\nResult: "+method_1(array,string.length()));
	    method_1(array,string.length());
	 }


	private static String method_1(char[] array, int length) {
	    int spaceCount = 0;
	    for(int i=0; i<array.length; i++){
	        if(array[i]==' ') spaceCount++;
	    }
	    int count = 0;
	    int newLength = length + spaceCount*2;
	    char[] newArray = new char[newLength];

	    for(int i= 0; i<array.length; i++){
	        if(array[i]==' '){
	            newArray[count++] = '%';
	            newArray[count++] = '2';
	            newArray[count++] = '0';
	        }else{
	            newArray[count] = array[i];
	            count++;
	        }
	    }
	    String newString1 = new String(newArray);

	    return newString1;
	}
	}



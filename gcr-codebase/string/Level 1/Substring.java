import java.util.Scanner;
public class Substring{
    public static String createSubstring(String str, int startIndex, int endIndex){
	String sub = ""; 
	for (int i = startIndex; i < endIndex; i++){
	    sub = sub + str.charAt(i);
	}
	return sub;
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String str = input.next();
	System.out.println("Enter start and end index of substring: ");
	int startIndex = input.nextInt();
	int endIndex = input.nextInt();


	String sub1 = createSubstring(str, startIndex, endIndex);
	String sub2 = str.substring(startIndex, endIndex);
	
	if (sub1.equals(sub2)) {
	    System.out.println("The substring is > " + sub1 + " < and both substring and charAt results are same");
	} else {
	    System.out.println("The results are not same");	
	}
    }
}
	
	
	
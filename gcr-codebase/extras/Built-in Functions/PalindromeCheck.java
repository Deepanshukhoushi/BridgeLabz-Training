import java.util.Scanner; 
public class PalindromeCheck{
    public static String takeInput(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String phrase = input.nextLine();
    return phrase;
    }
    public static boolean checkPhrase(String phrase){
	String rev = "";
        for (int i = phrase.length() - 1; i >= 0; i--) {
            rev += phrase.charAt(i);
        }	
	if (phrase.equals(rev)){ 
	    return true;
	} else {
	    return false;
	}
    }

    public static void displayResult(boolean result){
	if (result) {
	    System.out.println("the phrase is palindrome");
	} else {
 	    System.out.println("The phrase is not palindrome");
	}
    }


    public static void main(String[] args){
	String str = takeInput();
	boolean result = checkPhrase(str);
	displayResult(result);
    }
}

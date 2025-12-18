// Create class SpringSeason
public class SpringSeason{
    public static void main(String[] args){
	
	//take input from command line
	int month = Integer.parseInt(args[0]);
	int day = Integer.parseInt(args[1]);
	
	//applying conditions of Spring Season and displaying output
	if ((month==3 && day>=20) || (month == 4 || month == 5) || (month==6 && day<=20)){
	    System.out.println("Its a Spring Season");
	} else {
	    System.out.println("Not a Spring Season");
	}
    }
}
	
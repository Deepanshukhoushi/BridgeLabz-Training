public class SpringSeason{
    public static boolean checkDates(int month, int day){
	if ((month==3 && day>=20) || (month == 4 || month == 5) || (month==6 && day<=20)){
	    return true;
	} else {
	    return false;
	}
    }
    public static void main(String[] args){
	int month = Integer.parseInt(args[0]);
	int day = Integer.parseInt(args[1]);
	
	boolean season = SpringSeason.checkDates(month, day);
	
	if (season==true){
	    System.out.println("Its a Sprint Season");
	} else {
	    System.out.println("Not a Spring Season");
	}
    }
}
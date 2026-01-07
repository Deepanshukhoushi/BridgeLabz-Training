import java.util.Scanner;
public class FindRotationPoint {
	public static int findRotation(int[] arr){
		int start = 0;
		int end = (arr.length)-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if (arr[mid] > arr[start] && arr[start]>arr[end]) start = mid+1;
			else if (arr[mid] == arr[start] && arr[start] > arr[end]) start = mid+1;
			else if (arr[start] > arr[mid] && arr[mid] < arr[end]) end =mid;
			else end = mid-1;
		}
		return start;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter count of numbers: ");
		int size = input.nextInt();
		input.nextLine();
		System.out.println("Enter " + size + " numbers:");
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		int result = findRotation(arr);
		System.out.println("The smallest number is on Index " + result + " and the number is "+ arr[result]);
		input.close();
	}
}

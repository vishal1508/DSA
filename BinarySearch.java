import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int [] arr = {1,2,3,5,6,7,8,9,10,11};

		System.out.print("enter number want to find : = ");
		int find_number = sc.nextInt();

		int low = 0; 
		int high = arr.length - 1;

		while(low <= high){
			int mid = (low + high) / 2;
			if(arr[mid] == find_number ){
				System.out.println(arr[mid] + " is Found at index "+mid);
				break;
			}
			else if(arr[mid] < find_number ){
				low = mid+1;
			}else{
				high = mid - 1;
			}
		}

	}
}
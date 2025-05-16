import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7,8};
		System.out.print("Enter a number to search : ");
		int target = sc.nextInt();

		int start = 0;
		int end = a.length - 1;
		int mid = (start + end)/2;
		boolean isFound = false;
		while(start <= end){
			if(a[mid] == target){
				System.out.println(target+" is found at index : "+mid);
				isFound = true;
				break;
			}
			 if(a[mid]> target){
				end = mid - 1;
			}		
			else{
			start = mid + 1;
			}
			
			 mid = (start + end)/2;
		}
		if(!isFound){
		System.out.print(target+" is not found");
		}
	}
}

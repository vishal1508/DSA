import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7,18};
		System.out.print("Enter a number to search : ");
		int target = sc.nextInt();

		binarySearch(a,0,a.length - 1,target);
	}
	public static int binarySearch(int[] a, int start, int end, int target){


		while(start <= end){
			int mid = start + (end - start) / 2;
			if(a[mid] == target){
				System.out.println(target+" found at index "+mid);
				break;
			}else if(a[mid] > target){
				end = mid - 1;
			}else{
				start = mid + 1;
			}
			
		}
		return -1;
		
	}
}

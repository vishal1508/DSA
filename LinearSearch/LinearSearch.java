import java.util.*;
class LinearSearch{
	public static void main(String[] args)
	{
		int a[] = {1,43,3,4,5,2,7};
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number to search : ");
		int target = sc.nextInt();
	
		for(int i = 0; i < a.length; i++){
			if(a[i] == target){
				System.out.println(target+" is Found at index : "+i);
				break;
			}
		}
	
		
	}
}

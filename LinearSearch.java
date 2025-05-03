import java.util.*;
class LinearSearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter array Size");
		int array_size = sc.nextInt();
		int a[] = new int[array_size];
		System.out.println("enter numbers in array");
		for(int i = 0; i < array_size;i++){
		int n = sc.nextInt();
		a[i] = n;
		}
		System.out.print("[");
		for(int i = 0; i < a.length;i++){
			System.out.print(a[i]+ (i < a.length-1 ? ", ":""));
		}
		System.out.println("]");

		System.out.print("enter a number to Search from that array := ");

		int search_number = sc.nextInt();

		for(int i = 0; i < a.length; i++){
			if(a[i] == search_number){
				System.out.println("Number is Found at "+i+"th index");
				break;
			}else if(i == a.length - 1)
			{
				System.out.println(search_number+" Not Found in Given Array");
			}
			
		}
		
	}
}

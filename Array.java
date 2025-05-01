
class Array{
public static void main(String[] args)
	{
		int [] a = {1,2}; //1 dimensional Array
		int [][] b = {{1,2},{1,2,3,4},{1,2,3}};

		System.out.println("1 dimensional array");
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("length0 :=> "+b[0].length);
		System.out.println("length1 :=> "+b[1].length);
		System.out.println("length2 :=> "+b[2].length);

		for(int i = 0; i < b.length; i++){
			System.out.print("{");
			for(int j = 0; j < b[i].length; j++){
				System.out.print(b[i][j]+",");
			}

			System.out.println("}");
		}
	}
}

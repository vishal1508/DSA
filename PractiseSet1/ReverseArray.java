class ReverseArray{
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5};

        // for(int i = 0; i < a.length; i++){
        //     for(int j = 0; j < a.length - i - 1; j++){
        //         if(a[j] < a[j+1]){
        //             int temp = a[j];
        //             a[j] = a[j+1];
        //             a[j+1]=temp;
        //         }
        //     }
        // }
        //using 2 pointer
        for(int i = 0; i < a.length / 2; i++){
            for(int j = i; j < a.length - i - 1; j++){
                int temp = a[j];
                a[j]=a[a.length - j - 1];
                a[a.length - j - 1] = temp;
            }
        }
        System.out.print("{");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+(i < a.length-1?", ":""));
        }
        System.out.println("}");

    }
}
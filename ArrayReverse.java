class Main {
    public static void main(String[]args){
        int[] arr = {1,8,5,2,3,4,6,7,9}; 

       
        for (int i = 0 ; i < arr.length / 2 ; i++){
        int temp = arr[i] ;
        int n = (arr.length - 1) - i;        
            arr[i] = arr[n];
            arr[n] = temp;
            
        }
        for (int i = 0 ; i < arr.length; i++){

        System.out.println(arr[i]);

        }

        

    }
}
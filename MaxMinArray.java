
class Main{
    public static void main (String[] args){
        int[] arr = {1,8,5,2,3,4,6,7,9,10}; 
        // int i ,j, temp;
        // for (i = 0 ; i < arr.length ; i++){

        //     for (j =0 ; j < arr.length -1 ; j++){
        //         if (arr[j] > arr[j+1]){
        //             temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;

        //         }
                
        //     }
        // }    

        // System.out.print("min =" + arr[0] + "max = " + arr[arr.length]);

        int i , j , min = arr[0] , max= arr[0] , temp =0;


        for ( i = 0; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
    if (arr[i] > max) {
        max = arr[i];
    }

}

            System.out.print(min);
            System.out.print(max);
        
        
    }
}

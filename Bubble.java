class Bubble {
    public static void main(String[] args) {
          int[] arr = {1,8,5,2,3,4,6,7,9,10}; 
        int i ,j, temp;
        for (i = 0 ; i < arr.length ; i++){

            for (j =0 ; j < arr.length -1 ; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
                
            }
        }  

         for (i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i]);
         }
    }
}

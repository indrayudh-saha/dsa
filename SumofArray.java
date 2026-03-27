import java.util.stream.IntStream;

class Main  {

public static void main(String[] args){

int[] arr = IntStream.rangeClosed(1, 100).toArray();
    int sum = 0;
    for(int i = 0 ; i <arr.length ; i ++){
        sum = sum + arr[i];
    }

    System.out.print(sum);
}
}
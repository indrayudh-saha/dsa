class Main {
    public static void main(String[]args){
        String t = "test";
        int i ;
        for (i = 0; i < t.length() /2; i++ ){

            char temp = t.charAt(i);
            int n = (t.length() -1)-i;

            t.charAt(i)= t.charAt(n);
            t.charAt(n) = temp;

            
            
        }

        System.out.print(t);
    }
}
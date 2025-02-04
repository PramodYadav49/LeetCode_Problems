public class DecimalToBinary {
    public static void main(String[] args) {
      System.out.println(DTOB(17));

    }

    public static String DTOB(int n){
        if(n==0){
            return "0";
        }
        String res="";
        while(n>0){
            int rem=n%2;
            res+=rem;
            n=n/2;
        }

        return new StringBuilder(res).reverse().toString();

    }
}

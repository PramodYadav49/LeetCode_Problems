public class findPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("hello"));

    }

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i!=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;

            }
            else{
                return false;
            }
        }
        return true;
    }
}


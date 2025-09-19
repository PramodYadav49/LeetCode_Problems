import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        if(digits.isEmpty()){
            System.out.println("");
        }
        else{
            List<String> ans = Solution.letterCombinations(digits);
            Collections.sort(ans);
            for(int i=0;i<ans.size();i++){
                System.out.print("" + ans.get(i) + " ");
            }

        }
        
    }
}

class Solution {
    
    static List<String> letterCombinations(String digits) {
        String [] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> list=new ArrayList<>();

        solutions(letters,0,digits,"",list);
        return list;

    }

    static void solutions(String[]letters,int index,String input,String res,ArrayList<String>list){
        if(res.length()== input.length()){
            list.add(res);
            return;
        }
        int digit=input.charAt(index)-'0';
        String str=letters[digit];
        for(int i=0;i<str.length();i++){
            solutions(letters,index+1,input,res+str.charAt(i),list);
        }
        

    }
};

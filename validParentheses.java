import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("((({))})"));
        
    }
    static boolean isValid(String s) {

        Stack<Character> stack=new Stack<Character>();
        

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ||ch=='{' || ch=='['){
                stack.push(ch);
            }
           else if(stack.isEmpty() || !isvalid(stack.pop(),ch)){
            return false;
           }


        }
        if (stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }


    }
    static boolean isvalid(char open,char ch){
        return (open=='(' && ch==')')
                || (open=='{' && ch=='}')
                || (open=='[' && ch==']');
    }
    
}

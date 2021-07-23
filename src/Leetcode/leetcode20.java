import java.util.*;

class leetcode20 {

    //使用栈先入后出，遇到对应的出栈，如果最后为空则代表有效
    //时间复杂度O(N)，空间复杂度O(N)
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        Map<Character,Character> map = new HashMap<Character,Character>(){{
            put('(',')');
            put('[',']');
            put('{','}');
            put('?','?');
        }};
        LinkedList<Character> stack = new LinkedList<Character>(){{ add('?'); }};
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                stack.addLast(c);
            }else if(map.get(stack.removeLast()) != c){
                return false;
            }
        }
        return stack.size()==1;
    }
}
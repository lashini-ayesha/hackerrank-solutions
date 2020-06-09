import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(isBalanced(input, map) ? "true" : "false" );
		}
    }
private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false; // odd length Strings are not balanced
        }        
        ArrayDeque<Character> deque = new ArrayDeque<>(); // use deque as a stack
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
	
}
-------------------------or---------------------------------------------------------

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()){};
    System.out.println(input.isEmpty());
		}
		
	}
}




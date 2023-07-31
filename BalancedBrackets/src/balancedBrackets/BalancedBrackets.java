package balancedBrackets;

import java.util.Stack;

public class BalancedBrackets {
	
	Stack<Character> stack=new Stack<>();  //([{}])
	public boolean isBalanced(String input) {
		
		boolean returnValue=false;
		for(int i=0;i<input.length();i++) {
			char str=input.charAt(i);
			
			if(str=='(' || str=='{' || str=='[') {
				stack.push(str);
			}
			
			else if(str==')' || str=='}' || str==']') {
				if(stack.isEmpty()) {
					returnValue=false;
					break;
				}
				char top=stack.pop();
				if((str==')' && top=='(') || (str=='}' && top=='{') || (str==']' && top=='[')) {
					returnValue=true;
				}else {
					returnValue=false;
					break;
				}
			}
		}
		
		if(!stack.isEmpty()) {
			returnValue=false;
		}
		
		return returnValue;
	}

}

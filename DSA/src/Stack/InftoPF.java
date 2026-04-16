package Stack;

import java.util.Stack;

public class InftoPF {
	
	public static int dsa(char opr) {
		switch (opr) {
		case '$':
			return 10;
		case '%':
			return 9;
		case '/':
			return 9;
		case '*':
			return 9;
		case '+':
			return 8;
		case '-':
			return 8;
		}
		return opr;
	}

	static Stack<Character> stack = new Stack<Character>();

public static void  Postfix(String S) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i<S.length(); i++){
		char ele = S.charAt(i);
	if(Character.isDigit(ele)) {
		sb.append(ele);
	}
	else if (Character.isDigit(ele)) {
        sb.append(ele);
    }
    else if (ele == '(') {
        stack.push(ele);
    }
    else if (ele == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
            sb.append(stack.pop());
        }
        stack.pop(); 
    }
   
        while (!stack.isEmpty() && (ele) <= (stack.peek())) {
            sb.append(stack.pop());
        }
        stack.push(ele);
	}
	System.out.println(S);
	}


	public static void main(String[] args) {
		String S = "1$9+3*4-(6+8/9)+7";
		Postfix(S);

	}
}

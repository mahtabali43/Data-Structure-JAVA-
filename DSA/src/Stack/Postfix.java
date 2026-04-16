package Stack;

import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {
//		String exp = "243+*5-";
		String exp = "456*3/+9+7-";
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i< exp.length(); i++) {
			char c = exp.charAt(i);
			
			if(Character.isDigit(c)) {
				st.push( (int)(c-'0') );
				
			}
			
			else {
				switch (c) {
				case '+':addition(st);
					break;
				case '-':sub(st);
				    break;
				case '*':mul(st);
			       break;
			       
				case '/':div(st);
			       break; 
			       
				case '%':mod(st);
			       break;
				
				}
			}
			
		
			
		}
		
		 while(!st.isEmpty()) {
            System.out.println(st.pop()+ " ");			 
		 }
	}

	private static void mod(Stack<Integer> st) {
		int a = st.pop();
		int b = st.pop();
		int r = b%a;
		st.push(r);
	}

	private static void div(Stack<Integer> st) {
		int a = st.pop();
		int b = st.pop();
		int r = b/a;
		st.push(r);
	}

	private static void mul(Stack<Integer> st) {
		int r = st.pop()* st.pop();
		st.push(r);
	}

	private static void sub(Stack<Integer> st) {
		int a = st.pop();
		int b = st.pop();
		int r = b - a;
		st.push(r);
	}

	private static void addition(Stack<Integer> st) {
		 
		int result =  st.pop()+st.pop();
		st.push(result);
	}
	
}

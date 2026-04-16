package Array.Basic;

import java.util.Arrays;
import java.util.Stack;

public class Duplicate {

	public static void main(String[] args) {
       
		int[] arr = {8,5,3,9,8,3,2,5,6,1,8,4,0,8};
		
		Arrays.sort(arr);
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
		Stack<Integer> s = new Stack<>();
		
		s.push(arr[0]);
		
		s.peek();
		
		for(int i = 1; i<arr.length; i++) {
			while(s.peek()==arr[i]) {
				if(s.peek()!=arr[i+1]) {
					System.out.print(arr[i]+" ");
				}
				i++;
			}
			
				s.push(arr[i]);
			
		}
		
	}

}

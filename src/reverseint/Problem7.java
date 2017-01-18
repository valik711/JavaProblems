package reverseint;

import java.util.Stack;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class Problem7 {
	public static void main(String[] args){
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> temp = new Stack<>();
				
		s1.push(1);
		s1.push(5);
		s1.push(2);
		
		s2.push(7);
		s2.push(7);
		s2.push(8);
		s2.push(8);
		
		System.out.println("Stack 1:" + s1);
		System.out.println("Stack 2:" + s2);
		
		
		int s2size = s2.size();
		while(!s1.isEmpty())  temp.push(s1.pop());
		while(!s2.isEmpty())  temp.push(s2.pop());
		
		while(s2size-- > 0) s1.push(temp.pop());
		while(!temp.isEmpty()) s2.push(temp.pop());
		
		System.out.println("Stack 1:" + s1);
		System.out.println("Stack 2:" + s2);
		
		
		
	}
	
}

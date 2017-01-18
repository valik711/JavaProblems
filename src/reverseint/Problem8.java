package reverseint;

import java.util.HashSet;

public class Problem8 {
	public static void main(String[] args){
		MySet a = new MySet();
		a.add(10);
		a.add(121);
		a.add(433);
		a.add(1);
		a.add(17);
		a.add(9);
		
		MySet b = new MySet();
		b.add(11);
		b.add(4);
		b.add(433);
		b.add(7);
		b.add(17);
		b.add(-1);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.intersect(b));
		System.out.println(a.union(b));
	}
	
	
	

}
class MySet extends HashSet<Integer>{
	public MySet union(MySet s){
		MySet ns = new MySet();
		ns.addAll(this);
		ns.addAll(s);
		return ns;
	}
	
	public MySet intersect(MySet s){
		MySet ns = new MySet();
		ns.addAll(this);
		ns.retainAll(s);
		return ns;
		}	
	
	
	
}
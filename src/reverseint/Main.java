package reverseint;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList();
		
		File f = new File(".");
		System.out.println(f.getAbsolutePath());
		
		getFilesInDir(list, f);
		
		Iterator i = list.iterator();
		while(i.hasNext()) System.out.println(i.next());
		
		
		
		
		
	}
	private static void getFilesInDir(ArrayList<String> l, File f){
		File[] files = f.listFiles();
		for(File fi:files){
			if(fi.isDirectory())  getFilesInDir(l, fi);
			else
			l.add(fi.getPath());
				
		}
	}
	
}

package reverseint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * 
 * @author valik711
 *
 * Initialize object with CSV table
 */

public class Main{
	public static void main(String[] args) throws IOException 
		{
		
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		String filename = "table.csv";
		BufferedReader b = new BufferedReader(new FileReader(filename));
		
		String separator = ";";
		
		String line;
		while((line = b.readLine()) != null) list.add(new ArrayList<String>(Arrays.asList(line.replaceAll(",", ".").split(separator))));
		b.close();
		System.out.println(list);
		
		Car mer1 = new Car(list.get(1));
		System.out.println(mer1);
		}
	
}

class Car{
	String name;
	double length;
	double width;
	double height;
	double engineVolume;
	String engineType;
	
	Car(){}
	Car(String n, double l, double w, double h, double ev, String et){
		this.name = n;
		this.length = l;
		this.width = w;
		this.height = h;
		this.engineVolume = ev;
		this.engineType = et;
	}
	Car(List<String> l){
		this(l.get(0), Double.parseDouble(l.get(1)), Double.parseDouble(l.get(2)), Double.parseDouble(l.get(3)), Double.parseDouble(l.get(4)), l.get(5));
	}
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", length=" + length + ", width=" + width + ", height=" + height
				+ ", engineVolume=" + engineVolume + ", engineType=" + engineType + "]";
	}

	
}

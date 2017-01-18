package reverseint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * 
 * Calculate Resistance from Current and Voltage using Least squares method
 * */

public class Problem9 {
	public static void main(String[] args){
		ArrayList<Double> u = new ArrayList<>(Arrays.asList(10.1, 10.2, 9.8, 10.0, 9.7));
		ArrayList<Double> i = new ArrayList<>(Arrays.asList(0.0251, 0.0246, 0.0251, 0.0249, 0.0254));
		
		double x = 0, y = 0;
		for(int j = 0; j < i.size(); j++){
			x += u.get(j)*i.get(j);
			y += i.get(j)*i.get(j);
		}
		
		System.out.println(x/y);
		
	}
}

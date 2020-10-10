//decimal sum
package practice;

import java.text.DecimalFormat;

public class Practice21 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		
		
		double x = 3.1;
		double y = 15.8;
		
		double sum = x+y;
		
		System.out.println(df.format(sum));
				
				
	}
	

}

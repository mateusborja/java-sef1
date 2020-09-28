package javasef1;

public class Exer15 {
	public static void main(String[] args) {
		
		String text1 = "1";
		
		//String para tipos primitivos
		int var1 = Integer.parseInt(text1);
		System.out.println(var1);
		
		byte var2 = Byte.parseByte(text1);
		System.out.println(var2);
		
		short var3 = Short.parseShort(text1);
		System.out.println(var3);
		
		float var4 = Float.parseFloat(text1);
		System.out.println(var4);
		
		double var5 = Double.parseDouble(text1);
		System.out.println(var5);
		
		long var6 = Long.parseLong(text1);
		System.out.println(var6);
		
				
		//textos primitivos para String
		//int
		text1 = String.valueOf(var1);
		//byte
		text1 = String.valueOf(var2);
		//short
		text1 = String.valueOf(var3);
		//float
		text1 = String.valueOf(var4);
		//double
		text1 = String.valueOf(var5);
		//long
		text1 = String.valueOf(var6);
		
				
		
	}
	
	

}

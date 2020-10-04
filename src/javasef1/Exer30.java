//  java scope
package javasef1;

public class Exer30 {
	public static void main(String[] args) {
		int v1 =10;
		
		if (v1 == 10) {
			System.out.println(v1);
			int v2 = v1;
			
		} else {
			//System.out.println(v2); // not possible v2 not exist in else scope
			System.out.println(v1 + "\n");
			
		}
		
		System.out.println("-> program continue..." + "\n");
		
		//open scope
		{
			int e = 890;
			System.out.println(e);
			
		}
		
	}
	
}

package v48;

public class laxav48 {

	public static void main(String[] args) {
		System.out.println(volume(9));
	}
	
	public static double volume(double radius) {
		double result = 0;
		
		result = radius * radius * radius * Math.PI * 4/3;
		
		
		return result;
	}

	
}

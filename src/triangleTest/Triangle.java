package triangleTest;

public class Triangle {
	public Triangle(){}
	
	public String getType(int a, int b, int c) {
		if(a == b && b == c) {
			return "Equilateral";
		} else if(a == b || b == c || a == c) {
			return "Isosceles";
		}
		return "Scalene";
	}
}

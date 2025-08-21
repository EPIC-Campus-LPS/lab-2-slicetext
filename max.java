package lab2;

public class max {
	public static void main(String[] args) {
		System.out.println("2.3, 2.4: "+Max(2.3, 2.4));
		System.out.println("2, 4: "+Max(2, 4));
		System.out.println("2, 4.5: "+Max(2, 4.5));
		System.out.println("2.1, 4: "+Max(2.1, 4));
	}
	public static double Max(double num1, double num2) {
		return Math.max(num1, num2);
	}
	public static int Max(int num1, int num2) {
		return Math.max(num1, num2);
	}
	public static double Max(int num1, double num2) {
		return Math.max((double)num1, num2);
	}
	public static double Max(double num1, int num2) {
		return Math.max(num1, (double)num2);
	}
}

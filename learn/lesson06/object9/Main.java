package object9;

class Calculater{
	
	
	public int add(int a,int b) {
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	public double add(int a, int b,int c) {
		return a + b + c;
	}
	
}


public class Main {
	public static void main(String[] ages) {
		Calculater calc = new Calculater();
		System.out.println(calc.add(3,5));
		System.out.println(calc.add(2.5, 4.3));
		System.out.println(calc.add(1, 2, 3));
		
		
	}
	
	
	
	
	

}

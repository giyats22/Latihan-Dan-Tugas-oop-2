public class calculatorMain extends calculator {

	public void perkalian(int x, int y) {
	z = x + y;
	system.out.println("Hasil:" + z);
	}
	
	public static void main(string args[]) {
	 int a = 20, b = 10;
	 calculatorMain cal = new calculatorMain();
		cal.pertambahan(a, b);
		cal.pengurangan(a, b);
		cal.perkalian(a,b);
		}
	}
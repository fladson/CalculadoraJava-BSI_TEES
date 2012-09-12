package view;
import logic.Calc;
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("Decimal to Octal: "+calc.DecimalToOctal(9));
		System.out.println("Decimal to Binario: "+calc.DecimalToBinario(2));
		System.out.println("Decimal to Hexa: "+calc.DecimalToHexa(1000));
		
	}

}

package view;
import logic.Calculadora;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println("Decimal to Octal: "+calc.DecimalToOctal(9));
		System.out.println("Decimal to Binario: "+calc.DecimalToBinario(2));
		System.out.println("Decimal to Hexa: "+calc.DecimalToHexa(1000));
		
	}

}

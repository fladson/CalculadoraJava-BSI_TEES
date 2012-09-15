package view;
import logic.Calc;
import logic.CalcBin;
import logic.CalcInterface;
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calc calc = new Calc();
		String operador = args[0];
		
		Calc.calcular(args[0],args[1],args[2],args[3]);
		System.out.println("Decimal to Octal: "+calc.DecimalToOctal(9));
		System.out.println("Decimal to Binario: "+calc.DecimalToBinario(2));
		System.out.println("Decimal to Hexa: "+calc.DecimalToHexa(1000));
		
	}

}



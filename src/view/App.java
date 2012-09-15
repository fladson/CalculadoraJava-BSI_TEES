package view;
import logic.Calc;
import logic.CalcInterface;
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calc calc = new Calc();
		String operador = args[0];
		
		CalcInterface calculadora = new CalcInterface() {
			
			@Override
			public void zerarMostrador() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void subtrair() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void somar() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void multiplicar() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mostrarResultado() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void imprimirNaTela() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dividir() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calcular(String string, String string2, String string3,
					String string4) {
				// TODO Auto-generated method stub
				
			}
		};
		
		Calc.calcular(args[0],args[1],args[2],args[3]);
		System.out.println("Decimal to Octal: "+calc.DecimalToOctal(9));
		System.out.println("Decimal to Binario: "+calc.DecimalToBinario(2));
		System.out.println("Decimal to Hexa: "+calc.DecimalToHexa(1000));
		
	}

}



package logic;

public interface Calc {
	/**
	 * Método que realizará a soma de dois parametros passados
	 */
	public void somar(String num1, String num2);
	
	/**
	 * Método que realizará a subtração de dois parametros passados
	 */
	public void subtrair(String num1, String num2);
	
	/**
	 * Método que realizará a multiplicação de dois parametros passados
	 */
	public void multiplicar(String num1, String num2);
	
	/**
	 * Método que realizará a divisão de dois parametros passados
	 */
	public void dividir(String num1, String num2);
	
	/**
	 * Método que ira "Zerar" o Mostrador
	 */
	public void zerarMostrador();
	
	/**
	 * Método que imprimirá na tela o resultado
	 */
	public void imprimirNaTela();
	
	/**
	 * Método que realizará o calculo necessário
	 */
	public void mostrarResultado();

	public void calcular(String string, String string2, String string3,
			String string4);
}

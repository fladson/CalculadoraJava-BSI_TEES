package logic;

//Decimal, Octal, Binário e Hexadecimal
//Realizar as operações de soma, subtração, divisão, divisão interira, e resto;

public class Calculadora {
	
	public String DecimalToOctal(Integer decimal){
		return Integer.toString(decimal, 8);
	}
	
	public String DecimalToBinario(Integer decimal){
		return Integer.toString(decimal, 2);
	}
	
	public String DecimalToHexa(Integer decimal){
		return Integer.toString(decimal, 16);
	}
	

}

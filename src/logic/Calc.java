package logic;

//Decimal, Octal, Bin�rio e Hexadecimal
//Realizar as opera��es de soma, subtra��o, divis�o, divis�o interira, e resto;

public class Calc {
	
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

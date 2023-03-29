package secao8.aula72.entities;

public class CurrecyConverter {
	
	public static final double iof = 6;
	
	public static double converter(double dollarPrice, double dollarBought) {
		return dollarPrice * dollarBought * iof / 100 + dollarPrice * dollarBought;
				
	}
	
	
}
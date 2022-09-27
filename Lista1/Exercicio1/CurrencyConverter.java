package Exercicio1;


public class CurrencyConverter {
 
    static Double dollarToReal(double dollarPrice, double amount) {

		double real = amount * dollarPrice;
		double iof = real * (0.06);
		double toPay = real + iof;
		
		return toPay;
	}
}
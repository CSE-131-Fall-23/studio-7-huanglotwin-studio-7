package studio7;

public class Fraction {

	double numerator1; 
	double denominator1;
	double numerator2;
	double denominator2;
	
	public Fraction(double theNumerator1, double theDenominator1, double theNumerator2, double theDenominator2) {
		numerator1 = theNumerator1;
		denominator1 = theDenominator1; 
		numerator2 = theNumerator2;
		denominator2 = theDenominator2;
	}
	
	public static double Addition(double numerator1, double denominator1, double numerator2, double denominator2) {
		double sum = (numerator1/denominator1) + (numerator2/denominator2);
		return sum; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package studio7;
import java.lang.Math;

public class Die {

	private int n;
	
	public Die(int sidesN) {
		n = sidesN;
	}
	 public static int Random(int n) {
		 int x = (int)Math.random()*n + 1; 
		 return x;
		 
	 }
	public int Print() {
		return this.n;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die1 = new Die(2); 
		die1.Print();

	}

}

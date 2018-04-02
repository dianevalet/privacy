/**
 * 
 */
package domain;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author DIANA
 *
 */
public class Laplace {
	private double budget= 0.5;
	private boolean type_requete;
	public Laplace() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Float sensibilite(){
		
		return null;
		
	}
	public Double bruit(){
		 double b= 1.0/budget;
		 
		 double u = ThreadLocalRandom.current().nextDouble(-0.5, 0.5);
		 double sgn = Math.signum(u);
		 double x = 1-2*u;
		 double ln = Math.log1p(x);
		 double brui = -b*sgn*ln;
		 if(budget>0){
			 budget = budget - 0.01;
		 System.out.println("bruit= "+brui);
		 }
		 else{ System.out.println("le budget est atteint");
		 }
		return brui;
		
	}
	
	public static void main(String[] args) {
		Laplace l = new Laplace();
		l.bruit();
		l.bruit();
		l.bruit();
		
	}	
}

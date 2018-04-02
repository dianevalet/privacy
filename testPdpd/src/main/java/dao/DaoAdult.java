
package dao;


import java.util.List;

import domain.Adult;
import domain.Laplace;
import jpa.EntityManagerHelper;
import dao.GenericDao;


/**
 * @author DIANA
 *
 */
public class DaoAdult implements GenericDao<Adult,Long> {

	Laplace l = new Laplace();
	public Adult create(Adult t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Adult read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Adult update(Adult t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Adult t) {
		// TODO Auto-generated method stub
		
	}
	public List<Adult> listAdults(){
		String query = "select adult from Adult as adult";
		@SuppressWarnings("unchecked")
		List<Adult> adults = EntityManagerHelper.getEntityManager().createQuery(query).getResultList();
	
	/*for (Adult a : adults){
			System.out.println(a.getId());
			System.out.println(" prenom: " + a.getRace());
			
		}
	*/
	return adults;
		}

	/*
	 * Nombre de race distinct
	 */
	public void distinctRace() {
		double resultat;
		//String race= "Black";
		//String query = "select count(DISTINCT a.race)   from Adult a";
		String query = "select  COUNT(distinct race)  FROM Adult where race is not null ";
		 Object results = EntityManagerHelper.getEntityManager().createQuery(query).getSingleResult();
		 double reel = ((Number) results).intValue();
		    double count = ((Number) results).intValue()+ l.bruit();
		    
		    System.out.println("les differentes races existantes");
		    System.out.println( "   nombre de race reel:  "+reel);
		    System.out.println("nombre de race avec bruit:  "+count);
		
		//List<Object[]> results = EntityManagerHelper.getEntityManager().createQuery(query).getResultList();
		/*for (Object[] result : results) {
		    String race =  result[0].toString();
		    
		    double reel = ((Number) result[1]).intValue();
		    double count = ((Number) result[1]).intValue()+ l.bruit();
		    System.out.println("race:  "+race + "   nombre de race reel:  "+reel);
		    System.out.println("race:  "+race +"nombre de race bruite:  "+count);
		}
			*/	
		
	}

	/*
	 * Nombre de race distinct
	 */
	public double MasseSalariale() {
		double resultat;
		//String race= "Black";
		String query = "select sum( a.capital_gain)  from Adult a";
		 Object results = EntityManagerHelper.getEntityManager().createQuery(query).getSingleResult();
		 		resultat=((Number) results).intValue();
		    System.out.println("masse des gains en capitaux des employes:  "+resultat);
			return  resultat;
			
		
	}

	

}

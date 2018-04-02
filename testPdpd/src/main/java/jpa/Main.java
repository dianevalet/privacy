 package jpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import dao.DaoAdult;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.lang.Math;

public class Main {

	/**
	 * @param args
	 */
	
	
	
	public void afficherAdult(){
		
		DaoAdult daoAdult = new DaoAdult();
		//System.out.println("Q1 = " +daoAdult.listAdults().size());
		 daoAdult.distinctRace();
		 //daoAdult.MasseSalariale();
		
	}
	public static void main(String[] args) {
		
		System.out.println("ca marche");
		Main test= new Main();
		
		test.afficherAdult();
	}	
		
	}



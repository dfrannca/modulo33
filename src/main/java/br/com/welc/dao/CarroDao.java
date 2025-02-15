/**
 * 
 */
package br.com.welc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.welc.domain.Carro;

/**
 * 
 */
public class CarroDao implements ICarroDao{
	

	@Override
	public Carro cadastrar(Carro car) {
		// TODO Auto-generated method stub
			EntityManagerFactory entityManagerFactory = 
					Persistence.createEntityManagerFactory("ExemploJPA");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			entityManager.getTransaction().begin();
			entityManager.persist(car);
			entityManager.getTransaction().commit();
			 
			entityManager.close();
			entityManagerFactory.close();
				
		return car;
	}

}

package pe.edu.upc.StarUpElec.models.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.edu.upc.StartUpElec.models.entity.Customer;


public class CustomerRepositoryImpl {
	
		private static final long serialVersionUID = 1L;
	
		@PersistenceContext(unitName = "StarElec")
		private EntityManager se;

		public List<Customer> findByName(String name) throws Exception {
		// Declara la variable a retornar
		List<Customer> customer = new ArrayList<>();
		// Elaborar el JPQL
		String qlString = "SELECT c FROM Customer c WHERE c.name LIKE ?1";
		// Crear la consulta
		TypedQuery<Customer> query = se.createQuery(qlString, Customer.class);
		// Establer los paremetros
		query.setParameter(1, "%" + name.toUpperCase() + "%");
		// Obtener el resultado de la consulta
		customer = query.getResultList();
		return customer;
	}
	

	}


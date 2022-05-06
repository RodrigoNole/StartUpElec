package pe.edu.upc.StartUpElec.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.StartUpElec.model.entity.Employee;
import pe.edu.upc.StartUpElec.model.repository.EmployeeRepository;

@Named
@ApplicationScoped
public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	@PersistenceContext(unitName = "StartUpElecPU")
	private EntityManager entityManager;	

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<Employee> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}

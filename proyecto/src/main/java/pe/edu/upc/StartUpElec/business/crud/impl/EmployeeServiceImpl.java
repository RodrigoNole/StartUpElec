package pe.edu.upc.StartUpElec.business.crud.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.StartUpElec.business.crud.EmployeeService;
import pe.edu.upc.StartUpElec.model.entity.Employee;
import pe.edu.upc.StartUpElec.model.repository.EmployeeRepository;
import pe.edu.upc.StartUpElec.model.repository.JpaRepository;

@Named
@ApplicationScoped
public class EmployeeServiceImpl implements EmployeeService{
	
	@Inject
	private EmployeeRepository employeeRepository;

	
	@Override
	public JpaRepository<Employee, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return this.employeeRepository;
	}

	@Override
	public List<Employee> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return this.employeeRepository.findByName(name);
	}

}

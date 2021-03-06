package pe.edu.upc.StartUpElec.business.crud;



import java.util.List;

import pe.edu.upc.StartUpElec.model.entity.Employee;


public interface EmployeeService extends CrudService<Employee, Integer>{
	
	public List<Employee> findByName(String name) throws Exception;
}
